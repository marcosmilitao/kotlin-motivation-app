package com.militao.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.militao.motivation.R
import com.militao.motivation.infra.MotivationConstants
import com.militao.motivation.infra.SecurityPreferences
import com.militao.motivation.repository.Mock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences
    private var mPhraseFilter : Int = MotivationConstants.PHRASEFILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide();
        }

        mSecurityPreferences  = SecurityPreferences(this)
        val name = mSecurityPreferences.getString(MotivationConstants.KEY.PERSON_NAME)
        textName.text = "Olá, $name!"

        imageAll.setColorFilter(resources.getColor(R.color.colorAccent))
        handleNewPhrase()

        buttonNewPhrase.setOnClickListener(this);
        imageAll.setOnClickListener(this);
        imageHappy.setOnClickListener(this);
        imageSun.setOnClickListener(this);
    }

    override fun onClick(view: View) {
        val id = view.id

        val listFilter = listOf(R.id.imageAll,R.id.imageHappy,R.id.imageSun)
        if (id == R.id.buttonNewPhrase){
            handleNewPhrase()
        } else if (id in listFilter){
            handleFilter(id)
        }

        /*if (id == R.id.buttonNewPhrase){
            handleNewPhrase()
        } else if (id == R.id.imageAll){
            handleFilter(1)
        } else if (id == R.id.imageHappy){
            handleFilter(2)
        } else if (id == R.id.imageSun){
            handleFilter(3)
        }*/

    }



    private fun handleFilter(id: Int) {

        imageAll.setColorFilter(resources.getColor(R.color.white))
        imageHappy.setColorFilter(resources.getColor(R.color.white))
        imageSun.setColorFilter(resources.getColor(R.color.white))

        when(id) {
            R.id.imageAll -> {
                imageAll.setColorFilter(resources.getColor(R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHRASEFILTER.ALL
            }
            R.id.imageHappy -> {
                imageHappy.setColorFilter(resources.getColor(R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHRASEFILTER.HAPPY
            }
            R.id.imageSun -> {
                imageSun.setColorFilter(resources.getColor(R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHRASEFILTER.MORNING
            }
        }
    }

    private fun handleNewPhrase() {
        textPhrase.text = Mock().getPhrase(mPhraseFilter)
    }


}

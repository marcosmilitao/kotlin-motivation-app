package com.militao.motivation.repository

import com.militao.motivation.infra.MotivationConstants
import java.util.*


data class Phrase (val description: String, val category: Int)

class Mock {
    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY
    private val MORNING = MotivationConstants.PHRASEFILTER.MORNING

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Um negócio nunca é bom se com ele conseguimos um inimigo",HAPPY),
        Phrase("Um objetivo nada mais é do que um sonho com limite de tempo",HAPPY),
        Phrase("Sorte é o que acontece quando a preparação encontra a oportunidade",HAPPY),
        Phrase("O mercado dita inovações. Quem não segue vira peça de museu",HAPPY),
        Phrase("O único lugar que o sucesso vem antes do trabalho é no dicionário",HAPPY),
        Phrase("Se você quiser ir daqui para lá no mundo dos negócios, não encontrará nenhuma linha reta para levá-lo",HAPPY),
        Phrase("Integridade é a essência de todo negócio",HAPPY),
        Phrase("Existe o risco que você jamais pode correr. Existe o risco que você jamais pode deixar de correr",HAPPY),
        Phrase("As duas coisas mais importantes não aparecem no balanço da empresa: sua reputação e o seu time",HAPPY),
        Phrase("A qualidade do seu trabalho tem tudo a ver com a qualidade da sua vida",HAPPY),
        Phrase("Nenhuma empresa pode ter sucesso tentando tudo para todos",HAPPY),
        Phrase("Nunca se esqueça de um cliente; e nunca deixe que um cliente esqueça você",HAPPY),
        Phrase("Somos o que repetidamente fazemos. Portanto, a excelência não é um feito, é um hábito",HAPPY),
        Phrase("Persistência é irmã gêmea da excelência. Uma é mãe da qualidade, a outra a mãe do tempo",HAPPY),
        Phrase("O propósito de uma companhia é criar e manter o cliente",HAPPY),
        Phrase("Comemore os seus sucessos. Veja com humor os seus fracassos",HAPPY),
        Phrase("Autorrespeito, autoconhecimento e autocontrole conduzem a vida ao poder supremo",HAPPY),
        Phrase("É tentando o impossível que se chega à realização do possível",HAPPY),
        Phrase("Ganharão o jogo empresas que têm como missão exceder as expectativas dos clientes",HAPPY),
        Phrase("Toda empresa precisa ter gente que erra, que não tem medo de errar e que aprende com erro",HAPPY),
        Phrase("A confiança em si mesmo é o primeiro segredo do sucesso",HAPPY),
        Phrase("Aquele que pretende ser um líder tem que ser uma ponte",HAPPY),
        Phrase("Sempre que se vê um empreendimento de sucesso é porque alguém antes tomou uma decisão destemida",MORNING),
        Phrase("Serviços aos clientes é uma estratégia de marketing",MORNING),
        Phrase("Muda tuas ideias e mudarás teu mundo",MORNING),
        Phrase("Sua tarefa como líder é criar uma atmosfera que transforme o antagonismo em energia criativa",MORNING),
        Phrase("A publicidade traz os clientes até a porta; mas o mau serviço envia eles direto para fora",MORNING),
        Phrase("Único cliente bom é o cliente feliz. Lembre-se: clientes felizes adoram gastar dinheiro",MORNING),
        Phrase("Devemos prometer somente aquilo que podemos entregar e entregar mais do que prometemos",MORNING),
        Phrase("Nada de importante no mundo foi realizado sem paixão",MORNING),
        Phrase("Quem tem a obrigação de visualizar o futuro não é o cliente",MORNING),
        Phrase("Profissional nota 10 é aquele que tem 2 pontos de esforço, 3 pontos de talento e 5 pontos de caráter",MORNING),
        Phrase("Uma das melhores maneiras de convencer os outros é ouvindo. Ouça todos",MORNING),
        Phrase("O importante é mudar sempre, mesmo que estejamos crescendo e ganhando o jogo",MORNING),
        Phrase("Sempre que você vai encontrar um cliente você é a empresa",MORNING),
        Phrase("Se não puder destacar-se pelo talento, vença pelo esforço",MORNING),
        Phrase("Em busca do ótimo não se faz o bom",MORNING),
        Phrase("Se existe uma forma de fazer melhor, descubra-a",MORNING),
        Phrase("Fechar os olhos e os ouvidos para o cliente é uma loucura. É um suicídio empresarial",MORNING),
        Phrase("Não deixe o ruído das opiniões dos outros abafar a sua própria voz interior",MORNING),
        Phrase("Somente os que ousam errar muito podem realizar muito",MORNING),
        Phrase("Aceite os desafios para que possa sentir o sabor da vitória",MORNING),
        Phrase("A sorte favorece a mente preparada",MORNING),
        Phrase("Quando os momentos da verdade não são gerenciados, o serviço regride até a mediocridade",MORNING),
        Phrase("Metas são necessárias não só para nos motivar, mas para nos manter vivos”",MORNING),
        Phrase("Pessoas com meta têm sucesso pois sabem onde estão indo",MORNING),
        Phrase("A pessoa comum é exigente com os outros. A superior é exigente consigo mesmo",MORNING),
        Phrase("Não há sucesso sem dificuldade",MORNING)
    )

    fun getPhrase(categoryId: Int): String {

        val filtered = mListPhrases.filter { (it.category == categoryId || categoryId == ALL) }

        var range = Random().nextInt(filtered.size)

        return filtered[range].description
    }


}
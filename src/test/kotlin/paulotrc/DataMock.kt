package paulotrc

import main.kotlin.paulotrc.dataclasses.ConteudoEducacional

class DataMock {
    companion object {
        fun getListOfConteudosEducacionais():List<ConteudoEducacional> {
            val conteudoEducacionalIntroducao = ConteudoEducacional(nome = "Introducao ao Kotlin", duracao = 120)
            val conteudoEducacionalEvolucao = ConteudoEducacional(nome = "Aprofundamento ao Kotlin", duracao = 520)
            val conteudoEducacionalFinalizacao = ConteudoEducacional(nome = "Conteúdo extra em Kotlin", duracao = 120)
            return listOf(conteudoEducacionalIntroducao, conteudoEducacionalEvolucao, conteudoEducacionalFinalizacao)
        }
    }

}
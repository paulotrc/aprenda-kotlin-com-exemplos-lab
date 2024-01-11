package paulotrc

import main.kotlin.paulotrc.dataclasses.ConteudoEducacional
import main.kotlin.paulotrc.eumerators.Linguagem

class DataMock {
    companion object {
        fun getListOfConteudosEducacionaisBasicoKotlin():List<ConteudoEducacional> {
            val conteudoEducacionalIntroducao1 = ConteudoEducacional(nome = "Introducao a linguagem ${Linguagem.KOTLIN.name}", duracao = 120)
            val conteudoEducacionalIntroducao2 = ConteudoEducacional(nome = "Fluxo de controle com ${Linguagem.KOTLIN.name}", duracao = 120)
            val conteudoEducacionalIntroducao3 = ConteudoEducacional(nome = "Classes especiais em ${Linguagem.KOTLIN.name}", duracao = 120)
            return listOf(conteudoEducacionalIntroducao1, conteudoEducacionalIntroducao2, conteudoEducacionalIntroducao3)
        }
        fun getListOfConteudosEducacionaisIntermediarioKotlin():List<ConteudoEducacional> {
            val conteudoEducacionalIntermediario1 = ConteudoEducacional(nome = "Functions com ${Linguagem.KOTLIN.name}", duracao = 240)
            val conteudoEducacionalIntermediario2 = ConteudoEducacional(nome = "Collections com ${Linguagem.KOTLIN.name}", duracao = 240)
            val conteudoEducacionalIntermediario3 = ConteudoEducacional(nome = "Outras Functions com ${Linguagem.KOTLIN.name}", duracao = 240)
            return listOf(conteudoEducacionalIntermediario1, conteudoEducacionalIntermediario2, conteudoEducacionalIntermediario3)
        }
        fun getListOfConteudosEducacionaisAvancadoKotlin():List<ConteudoEducacional> {
            val conteudoEducacionalAvancado1 = ConteudoEducacional(nome = "Patterns com ${Linguagem.KOTLIN.name}", duracao = 300)
            val conteudoEducacionalAvancado2 = ConteudoEducacional(nome = "Productivity Booters com ${Linguagem.KOTLIN.name}", duracao = 300)
            val conteudoEducacionalAvancado3 = ConteudoEducacional(nome = "Graduação máxima Nivel Deus com ${Linguagem.KOTLIN.name}", duracao = 300)
            return listOf(conteudoEducacionalAvancado1, conteudoEducacionalAvancado2, conteudoEducacionalAvancado3)
        }
    }



}
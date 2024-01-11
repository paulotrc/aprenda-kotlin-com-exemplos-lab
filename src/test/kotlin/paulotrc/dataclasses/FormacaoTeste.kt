package paulotrc.dataclasses

import main.kotlin.paulotrc.eumerators.Linguagem
import main.kotlin.paulotrc.eumerators.Nivel
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import paulotrc.DataMock

class FormacaoTeste {

    @Test
    @DisplayName("Deve preencher conteúdos educacionais nivel basico com sucesso")
    fun devePreencherConteudosEducacionaisComSucessoNivelBasico(){
        val conteudoEducacionalList = DataMock.getListOfConteudosEducacionaisBasicoKotlin()
        val formacao = Formacao(nome = Linguagem.KOTLIN.name, Nivel.BASICO, Formacao.montaFormacaoPeloNivelELinguagem(Nivel.BASICO, Linguagem.KOTLIN))
        Assertions.assertEquals(formacao.conteudos, conteudoEducacionalList)
    }
    @Test
    @DisplayName("Deve preencher conteúdos educacionais nivel intermediario com sucesso")
    fun devePreencherConteudosEducacionaisComSucessoNivelIntermediario(){
        val conteudoEducacionalList = DataMock.getListOfConteudosEducacionaisIntermediarioKotlin()
        val formacao = Formacao(nome = Linguagem.KOTLIN.name, Nivel.INTERMEDIARIO, Formacao.montaFormacaoPeloNivelELinguagem(Nivel.INTERMEDIARIO, Linguagem.KOTLIN))
        Assertions.assertEquals(formacao.conteudos, conteudoEducacionalList)
    }
    @Test
    @DisplayName("Deve preencher conteúdos educacionais nivel avançado com sucesso")
    fun devePreencherConteudosEducacionaisComSucessoNivelAvancado(){
        val conteudoEducacionalList = DataMock.getListOfConteudosEducacionaisAvancadoKotlin()
        val formacao = Formacao(nome = Linguagem.KOTLIN.name, Nivel.AVANCADO, Formacao.montaFormacaoPeloNivelELinguagem(Nivel.AVANCADO, Linguagem.KOTLIN))
        Assertions.assertEquals(formacao.conteudos, conteudoEducacionalList)
    }

}
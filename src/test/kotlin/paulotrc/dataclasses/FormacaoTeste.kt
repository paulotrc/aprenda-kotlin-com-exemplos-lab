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

// Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório aprenda-kotlin-com-exemplos.
// Nesse contexto, iremos abstrair o seguinte domínio de aplicação:
// A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais voltados para
// uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. Formacoes possuem
// algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais. Além disso, tais
// experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de matricular
// um ou mais Alunos.
//
//TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [Desafio.kt] te ajudará 😉")
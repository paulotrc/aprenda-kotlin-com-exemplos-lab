package paulotrc.dataclasses

import main.kotlin.paulotrc.dataclasses.Formacao
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import paulotrc.DataMock

class FormacaoTeste {

    @Test
    @DisplayName("Deve preencher conteúdos educacionais com sucesso")
    fun devePreencherConteudosEducacionaisComSucesso(){
        val conteudoEducacionalList = mutableListOf(DataMock.getListOfConteudosEducacionais())
        val formacao = Formacao(nome = "Curso de Kotlin", conteudos = conteudoEducacionalList)
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
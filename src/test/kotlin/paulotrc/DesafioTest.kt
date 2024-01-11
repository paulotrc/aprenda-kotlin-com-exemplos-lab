package paulotrc

import main.kotlin.paulotrc.dataclasses.Usuario
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import src.paulotrc.Desafio

class DesafioTest {

    private lateinit var desafio : Desafio

    @BeforeEach
    fun configureSystemUnderTest() {
        desafio = Desafio()
    }
    @Test
    @DisplayName("Deve efetuar a matricula de um aluno com sucesso")
    fun matricular(){
        val usuario = Usuario(nome="Paulo", matricula="1")
        println(desafio.matricular(usuario))
        Assertions.assertTrue(desafio.matricular(usuario))
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
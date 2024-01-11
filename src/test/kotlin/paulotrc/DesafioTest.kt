package paulotrc

import main.kotlin.paulotrc.dataclasses.Aluno
import main.kotlin.paulotrc.eumerators.Linguagem
import main.kotlin.paulotrc.eumerators.Nivel
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import paulotrc.dataclasses.Formacao
import src.paulotrc.Desafio

class DesafioTest {

    private lateinit var desafio : Desafio

    @BeforeEach
    fun configureSystemUnderTest() {
        desafio = Desafio()
    }
    @Test
    @DisplayName("Deve efetuar a matricula de um aluno com sucesso")
    fun matricularUmAluno(){
        val aluno = Aluno(nome="Paulo", matricula="1")
        Assertions.assertTrue(desafio.matricularAlunoParaLinguagemPorNivel(aluno, Nivel.BASICO, Linguagem.KOTLIN))
    }

    @Test
    @DisplayName("Deve efetuar a matricula de mais de um aluno em uma formação com sucesso")
    fun matricularAlunosNaFormacao(){
        val aluno1 = Aluno(nome="Paulo", matricula="1")
        val aluno2 = Aluno(nome="Carlos", matricula="2")
        Assertions.assertTrue(desafio.matricularAlunosParaLinguagemPorNivel(aluno1, aluno2, nivel = Nivel.AVANCADO, linguagem = Linguagem.JAVA))
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
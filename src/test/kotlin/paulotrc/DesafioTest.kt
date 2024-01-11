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
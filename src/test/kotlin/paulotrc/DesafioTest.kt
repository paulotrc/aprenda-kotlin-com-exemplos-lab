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
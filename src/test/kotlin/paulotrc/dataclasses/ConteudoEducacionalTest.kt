package paulotrc.dataclasses

import main.kotlin.paulotrc.dataclasses.ConteudoEducacional
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConteudoEducacionalTest {
    @Test
    @DisplayName("Deve criar conteudo educacional com sucesso")
    fun deveCriarConteudoEducacionalComSucesso(){
        val conteudoEducacional = ConteudoEducacional("Curso Basico Kotlin", 5500)
        assertEquals("Curso Basico Kotlin", conteudoEducacional.nome)
        assertEquals(5500, conteudoEducacional.duracao)
    }
}
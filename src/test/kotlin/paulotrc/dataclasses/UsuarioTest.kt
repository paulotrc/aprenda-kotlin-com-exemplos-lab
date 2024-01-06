package paulotrc.dataclasses

import main.kotlin.paulotrc.dataclasses.Usuario
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class UsuarioTest {

    @Test
    @DisplayName("Deve criar usuário com sucesso")
    fun deveCriarUsuarioComSucesso(){
        val usuario = Usuario("Paulo", "1")
        assertEquals("Paulo", usuario.nome)
        assertEquals("1", usuario.matricula)
    }

}
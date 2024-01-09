package src.paulotrc

import main.kotlin.paulotrc.dataclasses.Usuario

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    //Teste

    val desafio = Desafio()
    val usuario = Usuario(nome="Paulo", matricula="1")
    println(desafio.matricular(usuario))

}
class Desafio() {
    fun matricular(usuario: Usuario) : Boolean {
//    TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        return true
    }

}



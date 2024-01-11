package src.paulotrc

import main.kotlin.paulotrc.dataclasses.Aluno
import main.kotlin.paulotrc.eumerators.Linguagem
import main.kotlin.paulotrc.eumerators.Nivel
import paulotrc.dataclasses.Formacao

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
fun main() {
    val desafio = Desafio()
    val aluno = Aluno(nome="Alfredo", matricula="10")
    desafio.matricularAlunoParaLinguagemPorNivel(aluno, Nivel.BASICO, Linguagem.KOTLIN)
    desafio.matricularAlunoParaLinguagemPorNivel(aluno, Nivel.BASICO, Linguagem.JAVA)
    desafio.matricularAlunoParaLinguagemPorNivel(aluno, Nivel.BASICO, Linguagem.PYTHON)

    val aluno2 = Aluno(nome="Manoel", matricula="11")
    desafio.matricularAlunoParaLinguagemPorNivel(aluno2, Nivel.INTERMEDIARIO, Linguagem.KOTLIN)
    desafio.matricularAlunoParaLinguagemPorNivel(aluno2, Nivel.INTERMEDIARIO, Linguagem.JAVA)
    desafio.matricularAlunoParaLinguagemPorNivel(aluno2, Nivel.INTERMEDIARIO, Linguagem.PYTHON)

    val aluno3 = Aluno(nome="Paulo", matricula="42")
    desafio.matricularAlunoParaLinguagemPorNivel(aluno3, Nivel.INTERMEDIARIO, Linguagem.KOTLIN)
    desafio.matricularAlunoParaLinguagemPorNivel(aluno3, Nivel.AVANCADO, Linguagem.JAVA)
    desafio.matricularAlunoParaLinguagemPorNivel(aluno3, Nivel.BASICO, Linguagem.PYTHON)

}

class Desafio() {
    fun matricularAlunoParaLinguagemPorNivel(aluno: Aluno, nivel: Nivel, linguagem: Linguagem) : Boolean {
        println("Matriculando o aluno ${aluno.nome} com a matricula ${aluno.matricula} no nivel ${nivel.name} e na linguagem ${linguagem.name}" )
        aluno.addFormacao(Formacao(linguagem.name, nivel, Formacao.montaFormacaoPeloNivelELinguagem(nivel, linguagem)))
        println("Aluno ${aluno.nome} com a matricula ${aluno.matricula} matriculado com sucesso")
        return true
    }

    fun matricularAlunosParaLinguagemPorNivel(vararg alunos: Aluno, nivel: Nivel, linguagem: Linguagem) : Boolean {
        alunos.forEach { aluno ->
            println("Matriculando o aluno ${aluno.nome} com a matricula ${aluno.matricula}" )
            aluno.addFormacao(Formacao(linguagem.name, Nivel.BASICO, Formacao.montaFormacaoPeloNivelELinguagem(nivel, linguagem)))
            println("Aluno ${aluno.nome} com a matricula ${aluno.matricula} matriculado com sucesso")
        }
        return true
    }
}
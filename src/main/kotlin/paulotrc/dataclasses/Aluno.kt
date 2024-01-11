package main.kotlin.paulotrc.dataclasses

import paulotrc.dataclasses.Formacao

data class Aluno(val nome: String, val matricula: String) {

    val formacoesAluno = mutableSetOf<Formacao>()
//    fun Aluno.formacoesPorNivel(nivel:Nivel): List<Formacao> = this.formacoesAluno.toList().filter { formacao: Formacao -> formacao.nivel.equals(nivel) }
//    fun Aluno.temFormacoesPeloNivel(nivel:Nivel): Boolean = !this.formacoesAluno.toList().filter { formacao: Formacao -> formacao.nivel.equals(nivel) }.isEmpty()

    fun addFormacao(formacao: Formacao){
        this.formacoesAluno.add(formacao)
        formacao.addInscritos(this)
        println("A formação:  ${formacao.nome} tem agora ${formacao.inscritos.count()} inscritos, ")
    }
    fun addFormacoes(vararg formacoes: Formacao){
        this.formacoesAluno.addAll(formacoes)
        formacoes.forEach {
            it.addInscritos(this)
            println("A formação:  ${it.nome} tem agora ${it.inscritos.count()} inscritos, ")
        }
    }
}
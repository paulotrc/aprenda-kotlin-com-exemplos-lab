package paulotrc.dataclasses

import main.kotlin.paulotrc.dataclasses.Aluno
import main.kotlin.paulotrc.dataclasses.ConteudoEducacional
import main.kotlin.paulotrc.eumerators.Linguagem
import main.kotlin.paulotrc.eumerators.Nivel

class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>?) {

    val inscritos = mutableSetOf<Aluno>()

    fun addInscritos(aluno:Aluno){
        this.inscritos.add(aluno)
    }

//    fun getInscritosPorNivelFormacao(nivel:Nivel): Int {
//        fun Aluno.temFormacoesPeloNivel(nivel:Nivel): Boolean = !this.formacoesAluno.toList().filter { formacao: Formacao -> formacao.nivel.equals(nivel) }.isEmpty()
//        val inscritos : Int = 0
//        this.inscritos.toList().forEach { aluno:Aluno -> aluno.temFormacoesPeloNivel(nivel)}?.let { inscritos + 1 }
//        return inscritos;
//    }
    companion object {

        fun montaFormacaoPeloNivelELinguagem(nivel: Nivel, linguagem:Linguagem): List<ConteudoEducacional> {
            print("O Nivel definido é : ${nivel} para a linguagem ${linguagem.name} e o conteúdo educacional é : ")
            println()
            val result = when (nivel) {                                     // 1
                Nivel.BASICO -> getListOfConteudosEducacionaisBasico(linguagem)
                Nivel.INTERMEDIARIO -> getListOfConteudosEducacionaisIntermediario(linguagem)
                Nivel.AVANCADO -> getListOfConteudosEducacionaisAvancado(linguagem)
            }
            return result
        }

        fun getListOfConteudosEducacionaisBasico(linguagem: Linguagem):List<ConteudoEducacional> {
            val conteudoEducacional1 = ConteudoEducacional(nome = "Introducao a linguagem ${linguagem.name}", duracao = 120)
            val conteudoEducacional2 = ConteudoEducacional(nome = "Fluxo de controle com ${linguagem.name}", duracao = 120)
            val conteudoEducacional3 = ConteudoEducacional(nome = "Classes especiais em ${linguagem.name}", duracao = 120)
            println("1 - Nome: ${conteudoEducacional1.nome} , com duração: ${conteudoEducacional1.duracao}")
            println("2 - Nome: ${conteudoEducacional2.nome} , com duração: ${conteudoEducacional2.duracao}")
            println("3 - Nome: ${conteudoEducacional3.nome} , com duração: ${conteudoEducacional3.duracao}")
            return listOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)
        }

        fun getListOfConteudosEducacionaisIntermediario(linguagem: Linguagem):List<ConteudoEducacional> {
            val conteudoEducacional1 = ConteudoEducacional(nome = "Functions com ${linguagem.name}", duracao = 240)
            val conteudoEducacional2 = ConteudoEducacional(nome = "Collections com ${linguagem.name}", duracao = 240)
            val conteudoEducacional3 = ConteudoEducacional(nome = "Outras Functions com ${linguagem.name}", duracao = 240)
            println("1 - Nome: ${conteudoEducacional1.nome} , com duração: ${conteudoEducacional1.duracao}")
            println("2 - Nome: ${conteudoEducacional2.nome} , com duração: ${conteudoEducacional2.duracao}")
            println("3 - Nome: ${conteudoEducacional3.nome} , com duração: ${conteudoEducacional3.duracao}")
            return listOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)
        }
        fun getListOfConteudosEducacionaisAvancado(linguagem: Linguagem):List<ConteudoEducacional> {
            val conteudoEducacional1 = ConteudoEducacional(nome = "Patterns com ${linguagem.name}", duracao = 300)
            val conteudoEducacional2 = ConteudoEducacional(nome = "Productivity Booters com ${linguagem.name}", duracao = 300)
            val conteudoEducacional3 = ConteudoEducacional(nome = "Graduação máxima Nivel Deus com ${linguagem.name}", duracao = 300)
            println("1 - Nome: ${conteudoEducacional1.nome} , com duração: ${conteudoEducacional1.duracao}")
            println("2 - Nome: ${conteudoEducacional2.nome} , com duração: ${conteudoEducacional2.duracao}")
            println("3 - Nome: ${conteudoEducacional3.nome} , com duração: ${conteudoEducacional3.duracao}")
            return listOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)
        }
    }
}
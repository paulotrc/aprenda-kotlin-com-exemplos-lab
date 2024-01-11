package main.kotlin.paulotrc.dataclasses

class ConteudoEducacional(val nome: String, val duracao: Int = 120) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ConteudoEducacional

        if (nome != other.nome) return false
        if (duracao != other.duracao) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + duracao
        return result
    }
}
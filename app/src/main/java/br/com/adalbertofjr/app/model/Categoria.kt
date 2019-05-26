package br.com.adalbertofjr.app.model

data class Categoria(
        val id: Int,
        val descricao: String,
        val urlImagem: String
) {
    override fun toString(): String = descricao
}

package br.com.adalbertofjr.app.model

data class Banner(
        val id: Int,
        val urlImagem: String,
        val linkUrl: String) {

    override fun toString(): String = urlImagem
}
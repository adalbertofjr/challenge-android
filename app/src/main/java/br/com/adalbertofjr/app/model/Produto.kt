package br.com.adalbertofjr.app.model

import java.math.BigDecimal

data class Produto(
        val id: Int,
        val nome: String,
        val urlImagem: String,
        val descricao: String,
        val precoDe: BigDecimal,
        val precoPor: BigDecimal,
        val categoria: Categoria
) {
    override fun toString(): String = nome
}

package br.com.adalbertofjr.app.repository

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria
import br.com.adalbertofjr.app.model.Produto

interface RepositoryContract {
    fun getBannerItems(): List<Banner>
    fun getCategorias(): List<Categoria>
    fun getMaisVendido(): List<Produto>
}
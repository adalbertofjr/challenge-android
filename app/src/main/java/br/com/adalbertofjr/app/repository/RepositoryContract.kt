package br.com.adalbertofjr.app.repository

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria

interface RepositoryContract {
    fun getBannerItems(): List<Banner>
    fun getCategorias(): List<Categoria>
}
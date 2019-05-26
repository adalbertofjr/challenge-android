package br.com.adalbertofjr.app.repository

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria
import br.com.adalbertofjr.app.model.Produto
import io.reactivex.Observable

interface RepositoryContract {
    fun getBannerItems(): Observable<Banner>
    fun getCategorias(): Observable<Categoria>
    fun getMaisVendido(): List<Produto>
}
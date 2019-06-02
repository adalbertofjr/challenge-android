package br.com.adalbertofjr.app.home

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria
import br.com.adalbertofjr.app.model.Produto

interface HomeContract {

    interface View {
        fun showBanners(banners: List<Banner>)
        fun showCategorias(categorias: List<Categoria>)
        fun showMaisVendidos(produtos: List<Produto>)
        fun onProdutoItemClick(produto: Produto)
    }

    interface Presenter {
        fun loadBannersData()
        fun loadCategoriasData()
        fun loadMaisVendidos()
    }
}
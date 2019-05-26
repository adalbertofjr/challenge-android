package br.com.adalbertofjr.app.home

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria

interface HomeContract {

    interface View {
        fun showBanners(banners: List<Banner>)
        fun showCategorias(categorias: List<Categoria>)
    }

    interface Presenter {
        fun loadBannersData()
        fun loadCategoriasData()
    }
}
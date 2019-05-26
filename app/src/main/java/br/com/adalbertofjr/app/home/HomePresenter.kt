package br.com.adalbertofjr.app.home

import br.com.adalbertofjr.app.repository.Repository

class HomePresenter(
        private val view: HomeContract.View,
        private val repository: Repository
) : HomeContract.Presenter {

    override fun loadBannersData() {
        view.let {
            val bannerItems = repository.getBannerItems()
            view.showBanners(bannerItems)
        }
    }

    override fun loadCategoriasData() {
        view.let {
            val categorias = repository.getCategorias()
            view.showCategorias(categorias)
        }
    }
}
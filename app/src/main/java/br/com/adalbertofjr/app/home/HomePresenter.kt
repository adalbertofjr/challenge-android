package br.com.adalbertofjr.app.home

import br.com.adalbertofjr.app.repository.Repository

class HomePresenter(
        private val view: HomeContract.View,
        private val repository: Repository
) : HomeContract.Presenter {

    override fun loadBannersData() {
        val bannerItems = repository.getBannerItems()
        view.let { view.showBanners(bannerItems) }
    }
}
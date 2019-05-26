package br.com.adalbertofjr.app.home

import br.com.adalbertofjr.app.model.Banner

interface HomeContract {

    interface View {
        fun showBanners(banners: List<Banner>)
    }

    interface Presenter {
        fun loadBannersData()
    }
}
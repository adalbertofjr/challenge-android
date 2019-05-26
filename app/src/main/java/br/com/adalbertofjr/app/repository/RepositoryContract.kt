package br.com.adalbertofjr.app.repository

import br.com.adalbertofjr.app.model.Banner

interface RepositoryContract {
    fun getBannerItems(): List<Banner>
}
package br.com.adalbertofjr.app.home

import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria
import br.com.adalbertofjr.app.repository.Repository
import io.reactivex.rxkotlin.subscribeBy
import timber.log.Timber

class HomePresenter(
        private val view: HomeContract.View,
        private val repository: Repository
) : HomeContract.Presenter {

    override fun loadBannersData() {
        view.let {
            val bannerItens = mutableListOf<Banner>()
            repository.getBannerItems()
                    .subscribeBy(
                            onNext = { banner ->
                                bannerItens.add(banner)
                            },
                            onError = { error ->
                                Timber.e(error)
                            },
                            onComplete = {
                                view.showBanners(bannerItens)
                            }
                    )
        }
    }

    override fun loadCategoriasData() {
        view.let {
            val categorias = mutableListOf<Categoria>()
            repository.getCategorias()
                    .subscribeBy(
                            onNext = { categoria ->
                                categorias.add(categoria)
                            },
                            onError = { error ->
                                Timber.e(error)
                            },
                            onComplete = {
                                view.showCategorias(categorias)
                            }
                    )
        }
    }

    override fun loadMaisVendidos() {
        view.let {
            val vendidos = repository.getMaisVendido()
            view.showMaisVendidos(vendidos)
        }
    }
}
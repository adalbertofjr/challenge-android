package br.com.adalbertofjr.app.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.model.Categoria
import br.com.adalbertofjr.app.model.Produto
import br.com.adalbertofjr.app.repository.Repository
import kotlinx.android.synthetic.main.fragment_home.*
import timber.log.Timber

class HomeFragment : Fragment(), HomeContract.View {

    lateinit var presenter: HomePresenter
    private val repository: Repository by lazy { Repository() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = HomePresenter(this, repository)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.loadBannersData()
        presenter.loadCategoriasData()
        presenter.loadMaisVendidos()
    }

    override fun showBanners(banners: List<Banner>) {
        banners.let {
            Timber.d("Banners id: ($banners)")
            txtDescricao.text = banners.toString()
        }
    }

    override fun showCategorias(categorias: List<Categoria>) {
        categorias.let {
            Timber.d("Categoria descrição: ($categorias)")
        }
    }

    override fun showMaisVendidos(vendidos: List<Produto>) {
        vendidos.let {
            Timber.d("Mais vendidos: ($vendidos)")
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}

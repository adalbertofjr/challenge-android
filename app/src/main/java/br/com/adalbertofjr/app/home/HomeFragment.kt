package br.com.adalbertofjr.app.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.componentes.carousel.adapter.CarouselViewPagerAdapter
import br.com.adalbertofjr.app.home.adapter.CategoriasAdapter
import br.com.adalbertofjr.app.home.adapter.ProdutosAdapter
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
            carousel.adapter = CarouselViewPagerAdapter(context!!, banners)
        }
    }

    override fun showCategorias(categorias: List<Categoria>) {
        categorias.let {
            Timber.d("Categoria descrição: ($categorias)")
            rvCategorias.setHasFixedSize(true)
            rvCategorias.adapter = CategoriasAdapter(context!!, categorias)
            rvCategorias.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        }
    }

    override fun showMaisVendidos(produtos: List<Produto>) {
        produtos.let {
            Timber.d("Mais vendidos: ($produtos)")
            rvMaisVendidos.setHasFixedSize(true)
            rvMaisVendidos.adapter = ProdutosAdapter(produtos, this::onProdutoItemClick)
            rvMaisVendidos.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
//            rvMaisVendidos.setOnTouchListener { v, event ->
//                true // disable scroll
//            }
        }
    }

    override fun onProdutoItemClick(produto: Produto) {
        Toast.makeText(context, produto.nome, Toast.LENGTH_SHORT).show()
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}

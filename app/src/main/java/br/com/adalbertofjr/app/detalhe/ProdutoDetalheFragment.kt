package br.com.adalbertofjr.app.detalhe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.model.Produto
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_produto_detalhe.*
import kotlinx.android.synthetic.main.fragment_produto_detalhe_content.*

class ProdutoDetalheFragment : Fragment() {
    val appCompatActivity by lazy { activity as AppCompatActivity }
    val toolbar by lazy { appCompatActivity.supportActionBar }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_produto_detalhe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        appCompatActivity.setSupportActionBar(tbDetalhe)
        toolbar?.setDisplayHomeAsUpEnabled(true)


        val produto = arguments?.getParcelable<Produto>(EXTRA_PRODUTO)
        produto?.let {
            with(produto) {
                Picasso.get().load(urlImagem).fit().centerInside().into(imvProduto)
                txvNome.text = nome
                txvPrecoDe.text = precoDe.toString()
                txvPrecoPor.text = precoPor.toString()
                txvNome.text = nome
                txvDescricao.text = descricao
            }
        }
    }

    companion object {
        const val TAG_DETALHE = "produto_tag_detalhe"
        private const val EXTRA_PRODUTO = "produto_id"

        fun newInstance(produto: Produto) = ProdutoDetalheFragment().apply {
            arguments = Bundle().apply { putParcelable(EXTRA_PRODUTO, produto) }
        }
    }
}
package br.com.adalbertofjr.app.detalhe

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.model.Produto

class ProdutoDetalheActivity : AppCompatActivity() {
    private lateinit var produto: Produto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)
        if (savedInstanceState == null) {
            showProdutoDetalheFragment()
        }
    }

    private fun showProdutoDetalheFragment() {
        produto = intent.getParcelableExtra(EXTRA_PRODUTO)
        produto.let {
            val fragment = ProdutoDetalheFragment.newInstance(produto)
            supportFragmentManager
                    .beginTransaction()
                    .replace(
                            R.id.container_detalhe, fragment,
                            ProdutoDetalheFragment.TAG_DETALHE
                    )
                    .commit()
        }
    }

    companion object {
        private const val EXTRA_PRODUTO = "extra_produto"
        fun open(activity: Activity, produto: Produto) {
            activity.startActivityForResult(
                    Intent(activity, ProdutoDetalheActivity::class.java)
                            .apply { putExtra(EXTRA_PRODUTO, produto) }, 0
            )
        }
    }
}

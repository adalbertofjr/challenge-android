package br.com.adalbertofjr.app.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.model.Produto
import br.com.adalbertofjr.app.util.load
import kotlinx.android.synthetic.main.produtos_item.view.*

class ProdutosAdapter(var produtos: List<Produto>) : RecyclerView.Adapter<ProdutosAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.produtos_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return produtos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos.get(position)
        holder.imvProduto.load(produto.urlImagem)
        holder.txvDescricao.text = produto.descricao
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imvProduto: ImageView = itemView.imvProduto
        val txvDescricao: TextView = itemView.txvDescricao
    }

}

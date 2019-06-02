package br.com.adalbertofjr.app.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.model.Categoria
import br.com.adalbertofjr.app.util.load
import kotlinx.android.synthetic.main.categoria_item.view.*
import timber.log.Timber

class CategoriasAdapter(var categorias: List<Categoria>,
                        private val callback: (Categoria) -> Unit
) :
        RecyclerView.Adapter<CategoriasAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.categoria_item, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            val categoria = categorias.get(viewHolder.adapterPosition)
            callback(categoria)
        }

        return viewHolder
    }

    override fun getItemCount(): Int {
        return categorias.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categoria = categorias[position]
        categoria.let {
            Timber.d((categoria.urlImagem))
            holder.imvCategoria.load(categoria.urlImagem)
            holder.txvDescricao.text = categoria.descricao
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imvCategoria: ImageView = itemView.imvCategoria
        val txvDescricao: TextView = itemView.txvDescricao
    }
}

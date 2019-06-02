package br.com.adalbertofjr.app.componentes.carousel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.model.Banner
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.carousel_item.view.*


class CarouselViewPagerAdapter(val items: List<Banner>, private val callback: (Banner) -> Unit) : PagerAdapter() {

    override fun instantiateItem(parent: ViewGroup, position: Int): Any {
        val banner = items.get(position)
        val layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.carousel_item, parent, false)
        Picasso.get().load(banner.urlImagem)
                .placeholder(R.drawable.ic_launcher_foreground)
                .fit()
                .into(layout.image)

        layout.setOnClickListener {
            callback(banner)
        }

        parent.addView(layout)
        return layout
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        val view = obj as View
        container.removeView(view)
    }
}
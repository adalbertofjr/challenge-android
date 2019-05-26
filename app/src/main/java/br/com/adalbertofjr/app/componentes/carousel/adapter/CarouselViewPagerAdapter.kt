package br.com.adalbertofjr.app.componentes.carousel.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.model.Banner
import br.com.adalbertofjr.app.util.load
import kotlinx.android.synthetic.main.carousel_item.view.*


class CarouselViewPagerAdapter(val context: Context, val items: List<Banner>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val banner = items.get(position)
        val layout = LayoutInflater.from(context).inflate(R.layout.carousel_item, container, false)
        layout.image.load(banner.urlImagem)
        container.addView(layout)
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
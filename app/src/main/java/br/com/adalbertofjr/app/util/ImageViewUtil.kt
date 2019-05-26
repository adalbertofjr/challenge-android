package br.com.adalbertofjr.app.util

import android.widget.ImageView
import br.com.adalbertofjr.app.R
import com.squareup.picasso.Picasso

fun ImageView.load(path: String) {
    Picasso.get().load(path)
            .placeholder(R.drawable.ic_launcher_foreground)
            .fit()
            .into(this)
}
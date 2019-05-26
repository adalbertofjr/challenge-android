package br.com.adalbertofjr.app.main

import androidx.fragment.app.Fragment

interface MainContract {
    interface View {
        fun showSelectedView(fragment: Fragment, tag: String)
    }

    interface Presenter {
        fun loadFragment(fragment: Fragment, tag: String)
    }
}
package br.com.adalbertofjr.app.main

import androidx.fragment.app.Fragment

class MainPresenter(val view: MainContract.View) : MainContract.Presenter {

    override fun loadFragment(fragment: Fragment, tag: String) {
        view.let {
            view.showSelectedView(fragment, tag)
        }
    }
}

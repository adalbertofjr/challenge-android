package br.com.adalbertofjr.app.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.home.HomeFragment
import br.com.adalbertofjr.app.sobre.SobreFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import timber.log.Timber

class MainActivity : AppCompatActivity(), MainContract.View {

    private val drawerToggle: ActionBarDrawerToggle by lazy {
        ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.app_name,
                R.string.app_name
        )
    }

    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        setDrawerLayout()
        presenter = MainPresenter(this)

        if (savedInstanceState == null) {
            selectMenuOption(navView.menu.findItem(R.id.action_home))
        }
    }

    private fun setDrawerLayout() {
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        navView.setNavigationItemSelectedListener { menuItem ->
            selectMenuOption(menuItem)
            true
        }
    }

    private fun selectMenuOption(menuItem: MenuItem) {
        menuItem.isChecked = true
        drawerLayout.closeDrawers()
        val tag = menuItem.title.toString()
        var fragment: Fragment? = supportFragmentManager.findFragmentByTag(tag)

        when (menuItem.itemId) {
            navView.menu.findItem(R.id.action_home).itemId -> {
                if (fragment == null) {
                    fragment = HomeFragment.newInstance()
                }
            }
            navView.menu.findItem(R.id.action_sobre).itemId -> {
                if (fragment == null) {
                    fragment = SobreFragment.newInstance()
                }
            }
        }

        fragment?.let {
            presenter.loadFragment(fragment, tag)
        }
    }

    override fun showSelectedView(fragment: Fragment, tag: String) {
        if (fragment.isVisible) {
            Timber.d("showSelectedView: (${fragment::class.java.simpleName}) já está visivel")
            return
        }

        Timber.d("showSelectedView: (${fragment::class.java.simpleName})")

        supportFragmentManager.beginTransaction()
                .replace(R.id.content, fragment, tag)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
    }
}

package br.com.adalbertofjr.app.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import br.com.adalbertofjr.app.R
import br.com.adalbertofjr.app.home.HomeFragment
import br.com.adalbertofjr.app.sobre.SobreFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {
    private val drawerToggle: ActionBarDrawerToggle by lazy {
        ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.app_name,
                R.string.app_name
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        setDrawerLayout()

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun selectMenuOption(menuItem: MenuItem) {
        menuItem.isChecked = true
        drawerLayout.closeDrawers()
        val title = menuItem.title.toString()
        var fragment: Fragment? = supportFragmentManager.findFragmentByTag(title)

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
            setFragment(
                    title,
                    fragment
            )
        }
    }

    private fun setFragment(title: String, fragment: Fragment) {
        if (fragment.isVisible) {
            return
        }

        supportFragmentManager.beginTransaction()
                .replace(R.id.content, fragment, title)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
    }
}

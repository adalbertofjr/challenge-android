package br.com.adalbertofjr.app.root

import android.app.Application
import timber.log.Timber.DebugTree
import timber.log.Timber
import br.com.adalbertofjr.app.BuildConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}
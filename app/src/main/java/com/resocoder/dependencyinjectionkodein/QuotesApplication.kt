package com.resocoder.dependencyinjectionkodein

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware


class QuotesApplication : Application(), KodeinAware {
    override val kodein: Kodein = Kodein.lazy {
        import(dataModule)
        import(appModule)
    }
}
package com.resocoder.dependencyinjectionkodein

import com.resocoder.dependencyinjectionkodein.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

val appModule = Kodein.Module("appModule") {
    bind() from provider { QuotesViewModelFactory(instance()) }
}

package com.resocoder.dependencyinjectionkodein

import com.resocoder.dependencyinjectionkodein.data.db.Database
import com.resocoder.dependencyinjectionkodein.data.db.DatabaseFakeImpl
import com.resocoder.dependencyinjectionkodein.data.db.QuoteDao
import com.resocoder.dependencyinjectionkodein.data.repository.QuoteRepository
import com.resocoder.dependencyinjectionkodein.data.repository.QuoteRepositoryImpl
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton


val dataModule = Kodein.Module("dataModule") {
    bind<Database>() with singleton { DatabaseFakeImpl() }
    bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
    bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
}
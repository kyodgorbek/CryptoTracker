package com.yodgorbekkomilov.cryptotracker.di

import com.yodgorbekkomilov.cryptotracker.core.domain.CoinDataSource
import com.yodgorbekkomilov.cryptotracker.core.data.networking.HttpClientFactory
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.yodgorbekkomilov.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import com.yodgorbekkomilov.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import org.koin.dsl.bind

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}
package com.yodgorbekkomilov.cryptotracker.core.domain

import com.yodgorbekkomilov.cryptotracker.core.domain.util.NetworkError
import com.yodgorbekkomilov.cryptotracker.core.domain.util.Result
import com.yodgorbekkomilov.cryptotracker.crypto.domain.Coin
import com.yodgorbekkomilov.cryptotracker.crypto.domain.CoinPrice
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}
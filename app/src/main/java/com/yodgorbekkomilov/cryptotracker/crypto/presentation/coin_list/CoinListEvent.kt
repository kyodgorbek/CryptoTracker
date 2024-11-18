package com.yodgorbekkomilov.cryptotracker.crypto.presentation.coin_list

import com.yodgorbekkomilov.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent{
    data class Error(val error: NetworkError): CoinListEvent

}
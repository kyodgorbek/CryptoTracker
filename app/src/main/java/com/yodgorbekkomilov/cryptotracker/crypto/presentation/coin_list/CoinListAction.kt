package com.yodgorbekkomilov.cryptotracker.crypto.presentation.coin_list

import com.yodgorbekkomilov.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}
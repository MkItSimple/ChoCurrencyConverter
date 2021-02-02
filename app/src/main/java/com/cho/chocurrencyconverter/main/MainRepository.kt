package com.cho.chocurrencyconverter.main

import com.cho.chocurrencyconverter.data.models.CurrencyResponse
import com.cho.chocurrencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}
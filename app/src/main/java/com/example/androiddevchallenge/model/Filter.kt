package com.example.androiddevchallenge.model

sealed class Filter(val name: String) {
    object EFT : Filter("EFTs")
    object STOCKS : Filter("Stocks")
    object FUND : Filter("Funds")
    object `401K` : Filter("401ks")
    object OTHER : Filter("Other")
}
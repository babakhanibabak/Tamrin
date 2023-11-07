package com.example.tamrin

fun main() {
    lateinit var networkService: String
    networkService = getNetWorkService()
    println(networkService)
}

fun getNetWorkService() = "NetWork service"
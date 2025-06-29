package com.example.portfolioservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class PortfolioServiceApplication

fun main(args: Array<String>) {
    runApplication<PortfolioServiceApplication>(*args)
}

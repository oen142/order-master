package com.example.ordermaster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderMasterApplication

fun main(args: Array<String>) {
    runApplication<OrderMasterApplication>(*args)
}

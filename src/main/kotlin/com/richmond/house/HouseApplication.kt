package com.richmond.house

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HouseApplication

fun main(args: Array<String>) {
    runApplication<HouseApplication>(*args)
}

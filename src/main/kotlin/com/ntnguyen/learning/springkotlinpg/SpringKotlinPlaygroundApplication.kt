package com.ntnguyen.learning.springkotlinpg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinPlaygroundApplication>(*args)
}

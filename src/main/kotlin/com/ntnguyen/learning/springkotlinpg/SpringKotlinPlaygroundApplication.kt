package com.ntnguyen.learning.springkotlinpg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinPlaygroundApplication>(*args)
}

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false

    if (!isValidStartChar(s[0])) return false

    for (c in s) {
        if (!isValidChar(c)) {
            return false
        }
    }
    return true
}

fun isValidStartChar(c: Char): Boolean = c == '_' || c in 'a'..'z' || c in 'A'..'Z'

fun isValidChar(c: Char): Boolean = isValidStartChar(c) || c in '0'..'9'

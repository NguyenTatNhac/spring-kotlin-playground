package com.ntnguyen.learning.springkotlinpg.controller

import com.ntnguyen.learning.springkotlinpg.dto.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/")
    fun greeting() = "Hello World!!!"

    @GetMapping("/hi")
    fun sayHi(@RequestParam("name") name: String) = Message(1, "Hi $name")
}
package com.webapp.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


data class Result(val id: Int, val title: String, val content: String)


@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(
        @RequestParam(value = "id", defaultValue = "0") id: Int,
        @RequestParam(value = "title", defaultValue = "DefaultTitle") title: String,
        @RequestParam(value = "content", defaultValue = "DefaultContent") content: String
    ) = Result(id, title, content)
}

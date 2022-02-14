package com.webapp.example.demo

import org.springframework.stereotype.Service

@Service
class IOCTestService {
    fun sayHello(name: String): String = "Hello $name"
}

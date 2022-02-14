package com.webapp.example.demo

import org.springframework.stereotype.Service

@Service
class AOPTestService {
    fun sayHello(name: String) : String = "Hello $name"
}

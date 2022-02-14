package com.webapp.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class IOCTestController1() {
    @Autowired lateinit var service: AOPTestService
    @GetMapping("/ioc1")
    fun hello(@RequestParam(value = "name") name: String) = service.sayHello(name)
}

@RestController
class IOCTestController2(val service: AOPTestService) {
    @GetMapping("/ioc2")
    fun hello(@RequestParam(value = "name") name: String) = service.sayHello(name)
}

@RestController
class IOCTestController4 {
    @set:Autowired
    lateinit var service: AOPTestService

    @GetMapping("/ioc4")
    fun hello(@RequestParam(value = "name") name: String) = service.sayHello(name)
}

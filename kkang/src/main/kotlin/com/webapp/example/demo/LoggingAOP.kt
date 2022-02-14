package com.webapp.example.demo

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAOP {
    @Before("execution(* com.webapp.example.demo.AOPTestService.sayHello(..))")
    fun beforeLogging(){
        println("beforeLogging.........")
    }
}

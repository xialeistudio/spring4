package org.xialei.spring4.ch1.dl

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(DiConfig::class.java)
    val useFunctionService = context.getBean(UseFunctionService::class.java)
    println(useFunctionService.sayHello("haha"))
    context.close()
}
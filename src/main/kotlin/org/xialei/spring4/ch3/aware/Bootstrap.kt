package org.xialei.spring4.ch3.aware

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(AwareConfig::class.java)
    val aware = context.getBean(AwareService::class.java)
    aware.outputResult()
    context.close()
}
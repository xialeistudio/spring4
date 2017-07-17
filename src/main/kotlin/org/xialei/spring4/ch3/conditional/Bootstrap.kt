package org.xialei.spring4.ch3.conditional

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(ConditionConfig::class.java)
    val list = context.getBean(ListService::class.java)
    println(context.environment.getProperty("os.name") + " > ${list.showListCmd()}")
    context.close()
}
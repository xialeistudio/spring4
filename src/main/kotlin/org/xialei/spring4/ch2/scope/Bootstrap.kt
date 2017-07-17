package org.xialei.spring4.ch2.scope

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(ScopeConfig::class.java)
    val s1 = context.getBean(DemoSingletonService::class.java)
    val s2 = context.getBean(DemoSingletonService::class.java)

    val p1 = context.getBean(DemoPrototypeService::class.java)
    val p2 = context.getBean(DemoPrototypeService::class.java)

    println("s1==s2: " + (s1 == s2))
    println("p1==p2: " + (p1 == p2))
    context.close()
}
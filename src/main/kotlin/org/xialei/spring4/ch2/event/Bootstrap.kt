package org.xialei.spring4.ch2.event

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(EventConfig::class.java)
    val publisher = context.getBean(DemoPublisher::class.java)
    publisher.publish("哈哈")
    context.close()
}
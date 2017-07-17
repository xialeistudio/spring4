package org.xialei.spring4.ch2.profile

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext()
    context.environment.setActiveProfiles("dev")
    context.register(ProfileConfig::class.java)
    context.refresh()

    val demoBean = context.getBean(DemoBean::class.java)
    println(demoBean.content)
    context.close()
}
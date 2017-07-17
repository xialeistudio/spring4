package org.xialei.spring4.ch3.taskscheduler

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(TaskSchedulerConfig::class.java)
}
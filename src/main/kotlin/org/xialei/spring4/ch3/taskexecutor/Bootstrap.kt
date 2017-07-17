package org.xialei.spring4.ch3.taskexecutor

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(TaskExecutorConfig::class.java)
    val s = context.getBean(AsyncTaskService::class.java)
    for (i in 0..9) {
        s.executeAsyncTask(i)
        s.executeAsyncTaskPlus(i)
    }
    context.close()
}
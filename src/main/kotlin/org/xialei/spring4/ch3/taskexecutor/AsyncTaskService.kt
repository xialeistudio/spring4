package org.xialei.spring4.ch3.taskexecutor

import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
open class AsyncTaskService {
    @Async
    fun executeAsyncTask(i: Int) {
        println("${Thread.currentThread().id}执行异步任务: $i")
    }

    @Async
    fun executeAsyncTaskPlus(i: Int) {
        println("${Thread.currentThread().id}执行异步任务+1:" + (i + 1))
    }
}
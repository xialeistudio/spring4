package org.xialei.spring4.ch3.taskscheduler

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.text.SimpleDateFormat
import java.util.*

@Service
class ScheduledTaskService {
    val format = SimpleDateFormat("HH:mm:ss")
    @Scheduled(fixedRate = 5000)
    fun reportTime() {
        println(format.format(Date()))
    }
}
package org.xialei.spring4.ch2.event

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Component
open class DemoPublisher {
    @Autowired
    lateinit var context: ApplicationContext

    fun publish(msg: String) {
        context.publishEvent(DemoEvent(this, msg))
    }
}
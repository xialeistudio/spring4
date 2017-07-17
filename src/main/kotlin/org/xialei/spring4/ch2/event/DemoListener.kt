package org.xialei.spring4.ch2.event

import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
open class DemoListener : ApplicationListener<DemoEvent> {
    override fun onApplicationEvent(event: DemoEvent) {
        val msg = event.msg
        println("demoListener接受到了demoPublisher发的消息:$msg")
    }
}
package org.xialei.spring4.ch2.event

import org.springframework.context.ApplicationEvent

class DemoEvent(source: Any, val msg: String) : ApplicationEvent(source) {
    companion object {
        private val serialVerstionUID = 1L
    }
}
package org.xialei.spring4.ch3.fortest

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
open class TestConfig {
    @Bean
    @Profile("dev")
    open fun devTestBean(): TestBean {
        return TestBean("from development profile")
    }

    @Bean
    @Profile("prod")
    open fun prodTestBean(): TestBean {
        return TestBean("from production profile")
    }
}
package org.xialei.spring4.ch2.profile

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
open class ProfileConfig {
    @Bean
    @Profile("dev")
    open fun devDemoBean(): DemoBean {
        return DemoBean("from development profile")
    }

    @Bean
    @Profile("prod")
    open fun prodDemoBean(): DemoBean {
        return DemoBean("from production profile")
    }
}
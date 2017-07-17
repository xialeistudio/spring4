package org.xialei.spring4.ch3.conditional

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

@Configuration
open class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition::class)
    open fun windowsListService(): ListService {
        return WindowsListService()
    }

    @Bean
    @Conditional(LinuxCondition::class)
    open fun linuxListService(): ListService {
        return LinuxListService()
    }
}
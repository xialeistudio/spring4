package org.xialei.spring4.ch3.conditional

import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.type.AnnotatedTypeMetadata

class WindowsCondition : Condition {
    override fun matches(context: ConditionContext, metadata: AnnotatedTypeMetadata?): Boolean {
        return context.environment.getProperty("os.name").contains("Windows")
    }
}
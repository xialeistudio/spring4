package org.xialei.spring4.ch2.scope

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service

@Service
@Scope("prototype")
class DemoPrototypeService {
}
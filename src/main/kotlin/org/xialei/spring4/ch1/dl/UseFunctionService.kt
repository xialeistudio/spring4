package org.xialei.spring4.ch1.dl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UseFunctionService {
    @Autowired
    lateinit var functionService: FunctionService

    fun sayHello(word: String): String {
        return functionService.sayHello(word)
    }
}
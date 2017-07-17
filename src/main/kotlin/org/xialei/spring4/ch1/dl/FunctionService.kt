package org.xialei.spring4.ch1.dl

import org.springframework.stereotype.Service

@Service
class FunctionService {
    fun sayHello(word: String): String {
        return "Hello, $word"
    }
}
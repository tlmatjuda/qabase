package com.toob.qabase.pages.google

import com.toob.qabase.pages.elementWithName
import org.springframework.stereotype.Component

@Component
class GooglePage {
    fun searchFor(text: String) {
        elementWithName("q").`val`(text).pressEnter()
    }
}
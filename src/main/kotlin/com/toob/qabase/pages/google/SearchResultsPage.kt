package com.toob.qabase.pages.google

import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.SelenideElement
import com.toob.qabase.pages.elementCollection
import com.toob.qabase.pages.elementWithId
import org.springframework.stereotype.Component

@Component
class SearchResultsPage {

    fun getResults(): ElementsCollection = elementCollection("h3")

    fun getResult(index: Int): SelenideElement {
        return elementWithId("#r1-$index")
    }

}
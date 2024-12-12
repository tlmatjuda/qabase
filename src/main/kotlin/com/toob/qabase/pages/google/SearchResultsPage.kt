package com.toob.qabase.pages.google

import com.codeborne.selenide.ElementsCollection
import com.toob.qabase.pages.elementCollection
import org.springframework.stereotype.Component

@Component
class SearchResultsPage {

    fun fetchResults(): ElementsCollection = elementCollection("h3")

}
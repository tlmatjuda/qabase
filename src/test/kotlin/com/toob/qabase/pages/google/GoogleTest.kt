package com.toob.qabase.pages.google

import com.codeborne.selenide.CollectionCondition.sizeGreaterThan
import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selenide.open
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GoogleTest {

    @Autowired
    lateinit var googlePage: GooglePage

    @Autowired
    lateinit var searchResultsPage: SearchResultsPage

    @Test
    fun `Validate That We Can Search On Google`() {
        open("https://google.com")
        googlePage.searchFor("selenide java")


        val resultsCollection = searchResultsPage.getResults()
        resultsCollection.shouldHave(sizeGreaterThan(1))
        resultsCollection[0].shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
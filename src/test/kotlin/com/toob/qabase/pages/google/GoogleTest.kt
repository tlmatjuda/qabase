package com.toob.qabase.pages.google

import com.codeborne.selenide.CollectionCondition.sizeGreaterThan
import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selenide.open
import com.toob.qabase.props.WebAppProps
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GoogleTest @Autowired constructor (
    val webAppProps: WebAppProps,
    val googlePage: GooglePage,
    val searchResultsPage: SearchResultsPage,
) {

    @Test
    fun `Validate That We Can Search On Google`() {
        open(webAppProps.baseUrl)
        googlePage.searchFor("selenide java")

        val resultsCollection = searchResultsPage.fetchResults()
        resultsCollection.shouldHave(sizeGreaterThan(1))
        resultsCollection[0].shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
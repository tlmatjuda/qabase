package com.toob.qabase.pages

import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.`$$`
import org.openqa.selenium.By


public fun elementWithName(name : String) = `$`(By.name(name))

public fun elementWithId(id : String) = `$`(By.id(id))

public fun elementCollection(nameOrId : String) = `$$`(nameOrId)
package com.toob.qabase.props

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties( prefix = "web-application")
data class WebAppProps(
    var baseUrl: String = ""
)


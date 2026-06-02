package com.moe.portfolio.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureStaticContent() {
    routing {
        staticResources("/static", "static")
        staticResources("/images", "static/images")
    }
}

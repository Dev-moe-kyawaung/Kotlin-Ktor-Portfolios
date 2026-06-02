package com.moe.portfolio.routes

import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*

fun Route.configureAboutRoutes() {
    get("/about") {
        call.respond(
            ThymeleafContent(
                "about",
                mapOf("title" to "About | Moe Kyaw Aung")
            )
        )
    }
}

package com.moe.portfolio.routes

import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*
import io.ktor.server.application.*
import com.moe.portfolio.services.PortfolioService

fun Route.configureHomeRoutes() {
    get("/") {
        call.respond(
            ThymeleafContent(
                "index",
                mapOf(
                    "title" to "Moe Kyaw Aung Portfolio",
                    "projects" to PortfolioService.projects(),
                    "socials" to PortfolioService.socials()
                )
            )
        )
    }
}

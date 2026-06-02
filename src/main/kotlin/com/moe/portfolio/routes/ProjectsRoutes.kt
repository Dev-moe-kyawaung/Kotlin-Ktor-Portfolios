package com.moe.portfolio.routes

import com.moe.portfolio.services.PortfolioService
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*

fun Route.configureProjectsRoutes() {
    get("/projects") {
        call.respond(
            ThymeleafContent(
                "projects",
                mapOf(
                    "title" to "Projects | Moe Kyaw Aung",
                    "projects" to PortfolioService.projects()
                )
            )
        )
    }
}

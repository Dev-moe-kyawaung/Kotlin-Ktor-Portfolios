package com.moe.portfolio.plugins

import com.moe.portfolio.routes.configureAboutRoutes
import com.moe.portfolio.routes.configureApiRoutes
import com.moe.portfolio.routes.configureContactRoutes
import com.moe.portfolio.routes.configureHomeRoutes
import com.moe.portfolio.routes.configureProjectsRoutes
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    install(Routing) {
    }

    routing {
        configureHomeRoutes()
        configureAboutRoutes()
        configureProjectsRoutes()
        configureContactRoutes()
        configureApiRoutes()
    }
}

package com.moe.portfolio.routes

import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.configureApiRoutes() {
    route("/api") {
        get("/health") {
            call.respond(mapOf("status" to "ok"))
        }
    }
}

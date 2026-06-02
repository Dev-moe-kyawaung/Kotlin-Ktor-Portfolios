package com.moe.portfolio.routes

import com.moe.portfolio.models.ContactForm
import com.moe.portfolio.services.ContactService
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*

fun Route.configureContactRoutes() {
    get("/contact") {
        call.respond(ThymeleafContent("contact", mapOf("title" to "Contact | Moe Kyaw Aung")))
    }

    post("/contact") {
        val params = call.receiveParameters()
        val form = ContactForm(
            name = params["name"].orEmpty(),
            email = params["email"].orEmpty(),
            message = params["message"].orEmpty()
        )

        val errors = ContactService.validate(form)
        if (errors.isNotEmpty()) {
            call.respond(
                ThymeleafContent(
                    "contact",
                    mapOf("title" to "Contact | Moe Kyaw Aung", "errors" to errors, "form" to form)
                )
            )
            return@post
        }

        call.respondText("Thanks! Message received.")
    }
}

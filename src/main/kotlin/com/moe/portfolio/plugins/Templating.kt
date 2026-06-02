package com.moe.portfolio.plugins

import io.ktor.server.application.*
import io.ktor.server.thymeleaf.*
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

fun Application.configureTemplating() {
    install(Thymeleaf) {
        setTemplateEngine(
            org.thymeleaf.TemplateEngine().apply {
                setTemplateResolver(
                    ClassLoaderTemplateResolver().apply {
                        prefix = "templates/"
                        suffix = ".html"
                        characterEncoding = "UTF-8"
                        templateMode = "HTML"
                        cacheable = false
                    }
                )
            }
        )
    }
}

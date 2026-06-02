package com.moe.portfolio

import com.moe.portfolio.plugins.configureRouting
import com.moe.portfolio.plugins.configureStaticContent
import com.moe.portfolio.plugins.configureTemplating
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureTemplating()
    configureStaticContent()
    configureRouting()
}

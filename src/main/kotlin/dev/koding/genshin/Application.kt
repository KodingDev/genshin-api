package dev.koding.genshin

import dev.koding.genshin.plugins.configureHTTP
import dev.koding.genshin.plugins.configureRouting
import dev.koding.genshin.plugins.configureSerialization
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = System.getenv("server.port")?.toIntOrNull() ?: 8080, host = "0.0.0.0") {
        configureRouting()
        configureHTTP()
        configureSerialization()
    }.start(wait = true)
}

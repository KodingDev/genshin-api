package dev.koding.genshin.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.locations.*

fun Application.configureRouting() {
    install(Locations)
    install(StatusPages) {
//        exception<AuthenticationException> { cause ->
//            call.respond(HttpStatusCode.Unauthorized)
//        }
//        exception<AuthorizationException> { cause ->
//            call.respond(HttpStatusCode.Forbidden)
//        }
    }
}
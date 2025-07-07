package com.example

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.receive
import io.ktor.server.response.respondText
import io.ktor.server.routing.post
import io.ktor.server.routing.routing
import kotlinx.serialization.json.Json

fun Application.setJsonParser() {
    install(ContentNegotiation) {
        json(Json {
            encodeDefaults = true
            ignoreUnknownKeys = true
        })
    }

//    routing {
//        post("/create") {
//            val user = call.receive<ExposedUser>() // Принять объект ExposedUser
//            println("Создан пользователь: $user")
//            call.respondText("Пользователь успешно создан.")
//        }
//    }
}
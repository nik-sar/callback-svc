package ru.rapidbit.callvacksvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CallvackSvcApplication

fun main(args: Array<String>) {
    runApplication<CallvackSvcApplication>(*args)
}

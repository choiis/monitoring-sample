package com.metriclogs.monitoringsample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class MonitoringSampleApplication {
    private val logger: org.slf4j.Logger = org.slf4j.LoggerFactory.getLogger(MonitoringSampleApplication::class.java)

    @GetMapping(value = ["check"])
    fun check(): ResponseEntity<String> {
        logger.info("check log")
        return ResponseEntity<String>("check", HttpStatus.OK)
    }

    @GetMapping(value = ["get"])
    fun get(): ResponseEntity<String> {
        logger.info("get log")
        return ResponseEntity<String>("get", HttpStatus.OK)
    }

    companion object {
        @kotlin.jvm.JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(MonitoringSampleApplication::class.java, *args)
        }
    }
}
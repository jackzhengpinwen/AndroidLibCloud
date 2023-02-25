package io.johnsonlee.springboot.starter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class StarterApplication

fun main(args: Array<String>) {
	runApplication<StarterApplication>(*args)
}

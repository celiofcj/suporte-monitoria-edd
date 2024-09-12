package com.github.celiofcj.sme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmeApplication

fun main(args: Array<String>) {
	runApplication<SmeApplication>(*args)
}

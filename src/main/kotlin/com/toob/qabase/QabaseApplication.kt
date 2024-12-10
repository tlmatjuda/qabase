package com.toob.qabase

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QabaseApplication

fun main(args: Array<String>) {
	runApplication<QabaseApplication>(*args)
}

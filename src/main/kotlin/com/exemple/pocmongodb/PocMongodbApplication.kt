package com.exemple.pocmongodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class PocMongodbApplication

fun main(args: Array<String>) {
	runApplication<PocMongodbApplication>(*args)
}

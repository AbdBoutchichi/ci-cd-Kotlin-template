package com.m1miage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CiCdKotlinTemplateApplication

fun main(args: Array<String>) {
        runApplication<CiCdKotlinTemplateApplication>(*args)
        println("Hello World!")
}
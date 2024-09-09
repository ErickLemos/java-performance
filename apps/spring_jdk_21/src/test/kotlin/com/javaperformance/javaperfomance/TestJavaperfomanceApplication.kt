package com.javaperformance.javaperfomance

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<JavaperfomanceApplication>().with(TestcontainersConfiguration::class).run(*args)
}

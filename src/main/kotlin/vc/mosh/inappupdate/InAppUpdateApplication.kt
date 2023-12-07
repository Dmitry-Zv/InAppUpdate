package vc.mosh.inappupdate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InAppUpdateApplication

fun main(args: Array<String>) {
	runApplication<InAppUpdateApplication>(*args)
}

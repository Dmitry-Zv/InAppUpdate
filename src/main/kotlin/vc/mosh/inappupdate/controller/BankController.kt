package vc.mosh.inappupdate.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vc.mosh.inappupdate.service.BankService


@RestController
@RequestMapping("api/bank")
class BankController(private val service: BankService) {

    @GetMapping
    fun getBanks() = service.getBanks()
}
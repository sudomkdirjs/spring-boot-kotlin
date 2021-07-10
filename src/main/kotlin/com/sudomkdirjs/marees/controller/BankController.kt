package com.sudomkdirjs.marees.controller

import com.sudomkdirjs.marees.datasource.BankDataSource
import com.sudomkdirjs.marees.model.Bank
import com.sudomkdirjs.marees.service.BankService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BankController(private val bankService: BankService) {

    @GetMapping("/banks")
    fun getBanks(): Collection<Bank> = bankService.getBanks()
}
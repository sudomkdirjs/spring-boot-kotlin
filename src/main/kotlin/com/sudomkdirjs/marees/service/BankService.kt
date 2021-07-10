package com.sudomkdirjs.marees.service

import com.sudomkdirjs.marees.datasource.BankDataSource
import com.sudomkdirjs.marees.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val bankDataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = bankDataSource.fetchBanks()
}
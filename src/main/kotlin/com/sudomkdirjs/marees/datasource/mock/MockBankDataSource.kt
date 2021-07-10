package com.sudomkdirjs.marees.datasource.mock

import com.sudomkdirjs.marees.datasource.BankDataSource
import com.sudomkdirjs.marees.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 0.0, 1),
        Bank("2312", 3.14, 2),
        Bank("423", 0.0, 0)
    )

    override fun fetchBanks(): Collection<Bank> = banks
}
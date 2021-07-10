package com.sudomkdirjs.marees.service

import com.sudomkdirjs.marees.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val bankDataSource: BankDataSource = mockk()
//    private val bankDataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(bankDataSource)

    @Test
    fun `it should call its data source to fetch banks`() {

        every { bankDataSource.fetchBanks() } returns emptyList()

        val banks = bankService.getBanks()

//        assertThat(banks).isNotEmpty
        verify(exactly = 1) { bankDataSource.fetchBanks() }
    }
}
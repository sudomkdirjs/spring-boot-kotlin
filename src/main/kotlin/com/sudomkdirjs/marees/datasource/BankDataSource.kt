package com.sudomkdirjs.marees.datasource

import com.sudomkdirjs.marees.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}
package com.sudomkdirjs.marees

import com.sudomkdirjs.marees.datasource.mock.MockBankDataSource
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MareesApplicationTests {

	private  val mockDataSource: MockBankDataSource = MockBankDataSource()

	@Test
	fun `should provide a collection of banks`() {

		// when
		val banks = mockDataSource.fetchBanks()

		//Then
		assertThat(banks.size).isGreaterThanOrEqualTo(3)
	}

	@Test
	fun `should provide some mock data`() {

		// when
		val banks = mockDataSource.fetchBanks()

		//Then
		assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
		assertThat(banks).anyMatch { it.trust != 0.0 }
		assertThat(banks).anyMatch() { it.transactionFee != 0 }
	}

}

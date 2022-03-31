package com.githubactions.regression

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {
	private val testSample: Sample = Sample()
	@Test
	fun contextLoads() {
		val expected = 42
		assertEquals(expected, testSample.sum(40, 2))
		println("Tested cool application")
	}

}

package com.githubactions.regression

import jdk.jfr.Description
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {
	private val testSample: Sample = Sample()
	@Test
	@Description("Test")
	fun contextLoads() {
		val expected = 42
		assertEquals(expected, testSample.sum(40, 2))
	}

}

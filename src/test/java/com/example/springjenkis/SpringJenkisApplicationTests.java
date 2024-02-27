package com.example.springjenkis;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkisApplicationTests {

	public static Logger SpringJenkisApplicationTests = LoggerFactory.getLogger(SpringJenkisApplicationTests.class);
	@Test
	void contextLoads() {
		SpringJenkisApplicationTests.info("Test case executing");
		assertEquals(2, 2);
		assertEquals(2, 2);
		assertEquals(2, 2);

	}

}

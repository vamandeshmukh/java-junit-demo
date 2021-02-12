package io.github.vamandeshmukh.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// unit testing, end-to-end testing, ...
// unit = method in java

// DRY = Do not Repeat Yourself 

public class AppTest {

	static Employee emp;

	@BeforeAll
	static void setUp() {
		System.out.println("set up once");
		emp = new Employee();
	}

	@AfterAll
	static void tearDown() {
		System.out.println("tear down once");
		emp = null;
	}

	@BeforeEach
	void start() {
		System.out.println("Start each time");
	}

	@AfterEach
	void end() {
		System.out.println("End each time");
	}

	@Test
	public void testWork() {
		System.out.println("testWork");
		String expected = "Employee works...";
		String actual = emp.work();
		assertEquals(expected, actual);
	}

	@Test
	@Disabled
	public void testWorkNegative() {
		System.out.println("testWorkNegative");
		String unexpected = "Employee does not work...";
		String actual = emp.work();
		assertNotEquals(unexpected, actual);
	}
}

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: MUHAMMAD ISSA BIN NORMAN
 * Student ID: 21001078
 * Class: W64L
 * Date/Time created: Friday 27-05-2022 13:20
 */

package tea;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Cp.Calculator;

/**
 * @author 21001078
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
		
	}
	@Test
	public void testSubtract() {
		int a = 6;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 3;
		assertEquals(actual, expected);
	}
	@Test
	public void testMultiply() {
		int a = 6;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 18;
		assertEquals(actual, expected);
	}
	@Test
	public void testDivide() {
		int a = 6;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.Divide(a, b);
		
		int expected = 2;
		assertEquals(actual, expected);
	}
}

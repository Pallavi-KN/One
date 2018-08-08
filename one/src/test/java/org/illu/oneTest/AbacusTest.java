package org.illu.oneTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.illu.one.Abacus;

public class AbacusTest {

	@Before
	public void setUp() throws Exception {
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void addTest() {
		assertTrue("Sum:-", Abacus.add(5, 5) == 10);
	}
	
	@Test
	public void substractTest() {
		assertTrue("Substract:-", Abacus.substract(5, 5) == 0);
	}
	
	@Test
	public void multiplyTest() {
		assertTrue("Multiply:-", Abacus.multiply(5, 5) == 25);
	}
	
	@Test
	public void divideTest() {
		// Below tow lines test the both if and else block of Claculator.divide() method
		// You can comment one line of the code and will see there is a change in coverage report
		assertTrue("Divide by non zero:-", Abacus.divide(5, 5) == 1);
		assertTrue("Divide by zero:-", Abacus.divide(5, 0) == -1);
	}

}

package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		int result = jUnit.addNumbers(100, 200);
		assertEquals (300, result);
	}

}

package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnitstring = new jUnitFunction();
		String result = jUnitstring.addStrings("sai","kumar");
		assertEquals("saikumar",result);
		
	}

}

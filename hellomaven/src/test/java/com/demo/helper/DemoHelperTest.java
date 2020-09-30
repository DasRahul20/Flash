package com.demo.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DemoHelperTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testDifferHelper() {
		
		DemoHelper ob1 = DemoHelper.getInstance();
		int result = ob1.differHelper(3, 5);
		
		assertEquals(2,result);
	}

}

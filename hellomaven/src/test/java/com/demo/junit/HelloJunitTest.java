package com.demo.junit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.Console;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.helper.DemoHelper;

@RunWith(MockitoJUnitRunner.class)
public class HelloJunitTest {

	@Mock
	private DemoHelper demoHelper;
	
	@Mock
	private System system;
	
	@Mock
	private Console console;
	
	@InjectMocks
	private HelloJunit helloJunit;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConcatinate() {
		String result = new HelloJunit().concatenate("Hello ", "World");

		assertEquals("Hello World", result);
	}
	
	@Test
	public void testConcatinateInt() {
		String result = new HelloJunit().concatenate("1","2");

		assertEquals("3", result);
	}

	@Test
	public void testDiffer() {

		// char[] secretValue = {'a','b'};
		
		when(demoHelper.differHelper(88, 65)).thenReturn(100);
		
		// when(System.console()).thenReturn(console);
		// when(console.readPassword()).thenReturn(secretValue);
		

		int result = helloJunit.differ(88, 65);

		assertEquals(100, result);
	}

}

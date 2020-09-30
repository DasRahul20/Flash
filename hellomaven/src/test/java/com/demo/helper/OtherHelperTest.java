package com.demo.helper;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OtherHelperTest {

	@Mock
	private DemoHelper demohelper;
	
	@InjectMocks
	private OtherHelper otherhelper;
	
	@Mock
	private System system;

	@Mock
	private Console console;
	
	@Before
	public void setup() throws Exception
	{
		
	}
	
	@Test
	public void testIsNull()
	{
		Object ob = null;
		boolean result = new OtherHelper().isNull(ob);
		assertEquals(true,result);
		
	}
	
	@Test
	public void testRemove()
	{
		ArrayList<String> list = new ArrayList<String>();
		
		// String str = "Banana";
		// String str1 = "Mango";
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list.add("Banana");
		list1.add("Mango");
		new <String>OtherHelper().removeThisFromThat(list,list1);
		
		for(String p:list1)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testScramble()
	{
		String str1 = "119,120,121,122";
		new OtherHelper().scrambleString(str1);
		
			
	}
	
	@Test
	public void testDescramble()
	{
		String res = new OtherHelper().descrambleString("68,69,70,71");
		assertEquals("ABCD",res);
	}
	
 /*	@Test
	public void testPwd()
	{
       //char[] secretValue = {'a','b','c','d'};
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// when(demoHelper.differHelper(88, 65)).thenReturn(100);
		
		when(System.console()).thenReturn(console);
		when(console.readPassword()).thenReturn(s);
		

		String pwd = otherhelper.readPassword("Welcome Home",s);

		assertEquals("Admin123", pwd);
	}*/
	
}

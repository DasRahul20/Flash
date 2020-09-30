package com.demo.junit;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringHelperTest {
	
	

	@Test
	public void testWordWrap()
	{
		String result = new StringHelper().wordWrap("I am Rahul Das",4);
		System.out.println(result);
		assertEquals("I am \r\nRahul \r\nDas \r\n",result);
	}
	
	@Test
	public void testReplaceInString()
	{
		String str = "W,X,Y,Z";
		String result = new StringHelper().replaceInString(str,"A","X","Y");
		assertEquals("W,A,A,Z",result);
	}
	
	@Test
	public void testIsEmptyFalse()
	{
		String str1 = "Rahul";
		String str2 = "Das";
		String str3 = "java";
		boolean result = new StringHelper().isEmpty(str1,str2,str3);
		
		assertEquals(false,result);
	}
	
	@Test
	public void testRepeatString()
	{
		String result = new StringHelper().repeatString("Hi", 5);
		assertEquals("HiHiHiHiHi",result);
	}
	
	@Test
	public void testIsEmptyTrue()
	{
		String str = "";
		boolean result = new StringHelper().isEmpty(str);
		assertEquals(true,result);
	}
    @Test
    public void testInsertIntoString()
    {
    	String str = "AUL";
    	String result = new StringHelper().insertIntoString(str,"R","H");
    	assertEquals("RAHUL",result);
    }
    
   /*@Test
    public void testShortenString()
    {
    	String OriginalStr = "";
    	String result = new StringHelper().shortenString(OriginalStr,8,0.5);
    	
    	assertEquals(".....",result);
    	
    }*/
}

package com.demo.junit;

import org.apache.commons.lang3.math.NumberUtils;

import com.demo.helper.DemoHelper;

public class HelloJunit {
	
	private DemoHelper demoHelper;
	
	public HelloJunit() {
		demoHelper = DemoHelper.getInstance();
	}

	public String concatenate(String one, String two) {

		if (NumberUtils.isDigits(one) && NumberUtils.isDigits(two)) {
			int number1 = NumberUtils.toInt(one);
			int number2 = NumberUtils.toInt(two);
			return String.valueOf(number1 + number2);
		}

		return one + two;
	}
	
	public int differ(int bigger, int smaller) {
		
		return demoHelper.differHelper(bigger, smaller);
	}

}


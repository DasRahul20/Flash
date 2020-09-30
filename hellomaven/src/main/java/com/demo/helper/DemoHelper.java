package com.demo.helper;

import java.util.Objects;

public class DemoHelper {

	private static DemoHelper demoHelper;

	private DemoHelper() {

	}

	public static DemoHelper getInstance() {

		if (Objects.isNull(demoHelper)) {
			demoHelper = new DemoHelper();
		}

		return demoHelper;
	}

	public int differHelper(int number1, int number2) {

		int result = number1 - number2;

		if (result < 0) {
			result = Math.abs(result);
		}

		return result;
	}

}

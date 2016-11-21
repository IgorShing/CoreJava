package com.corejava.lambda;

public class LambdaDemo {

	public double getDefaultValue() {
		MyNumber myNum;
		myNum = () -> 123.8958;

		return myNum.getValue();
	}

}

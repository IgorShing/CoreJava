package com.corejava.interfaces;

public class AlphaBetaClass implements IAlpha, IBeta {

	@Override
	public String reset() {
		return IAlpha.super.reset();
	}

	public String procB() {
		String str = "This";
		// System.exit(0);
		try {
			System.out.println("inside procB");
			str += " is";

			return str;
		} finally {

			str += " procB.";
			System.out.println("procB's finally");
			System.out.println(str);
		}
	}
}

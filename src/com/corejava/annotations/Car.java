package com.corejava.annotations;

import java.lang.reflect.Method;

public class Car {

	private int speed = 100;
	private String status = "Fixed";

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@MyAnno(str = "Speed increase", val = 20)
	public void increaseSpeed() throws NoSuchMethodException, SecurityException {
		Car ob = new Car();

		// First, get a Class object that represents
		// this class.
		Class<?> c = ob.getClass();

		// Now, get a Method object that represents
		// this method.
		Method m = c.getMethod("increaseSpeed");

		// Next, get the annotation for this class.
		MyAnno anno = m.getAnnotation(MyAnno.class);

		speed += anno.val();
		status = anno.str();
	}
}

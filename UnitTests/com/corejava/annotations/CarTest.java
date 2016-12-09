package com.corejava.annotations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.corejava.exceptions.MyException;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class CarTest {

	@Test
	public void testChecksSpeedAndStatusValuesAfterIncreaseSpeed()
			throws MyException, NoSuchMethodException, SecurityException {
		Car car = new Car();
		car.increaseSpeed();

		assertEquals("Speed increase", car.getStatus());
		assertEquals(120, car.getSpeed());

	}
}

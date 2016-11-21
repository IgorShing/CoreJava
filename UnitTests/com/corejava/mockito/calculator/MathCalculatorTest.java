package com.corejava.mockito.calculator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.mockito.calculator.CalculatorService;
import com.mockito.calculator.MathCalculator;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathCalculatorTest {

	// @InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	MathCalculator mathCalculator = new MathCalculator();

	// @Mock annotation is used to create the mock object to be injected
	@Mock
	CalculatorService calcService;

	@Test
	public void testAdd() {
		// add the behavior of calc service to add two numbers
		when(calcService.add(10.0, 20.0)).thenReturn(30.00);

		// test the add functionality
		assertEquals(mathCalculator.add(10.0, 20.0), 30.0, 0);
	}
}

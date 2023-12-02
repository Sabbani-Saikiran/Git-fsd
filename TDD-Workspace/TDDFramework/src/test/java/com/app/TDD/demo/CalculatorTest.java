package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Test
	public void testadd() {
		
		int a = 5;
		int b = 7;
		
		int result = calculator.add(a,b);
		
		//Assert
		
		Assert.assertEquals(result, 12, "Addition result is incorrect");
	}
	
	@Test
	public void testsubtract() {
		
		int c = 8;
		int d = 5;
		
		int result = calculator.subtract(c,d);
		
		//Assert
		
		Assert.assertEquals(result, 4, "Subtraction result is incorrect");

}
}

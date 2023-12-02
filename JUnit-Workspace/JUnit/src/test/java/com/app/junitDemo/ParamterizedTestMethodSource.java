package com.app.junitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParamterizedTestMethodSource {
	//argument = each value stored in method or enum or value source
	
	@ParameterizedTest
	@MethodSource("stringParameters")//this wil give the input
	public void getDataFromMethod(String input) {
		System.out.println("The value from method is : " + input);
	}
	
	// this method will pass  range of values
	
	public static Stream<String> stringParameters(){
		return Stream.of("Monday", "Tuesday", "wednesday");
	}

}
package com.busyqa.course.functional.lambda_expression;

import java.util.function.BiFunction;

public class LambdaBiFunction {

	public static void main(String[] args) {

		BiFunction<Double,Double,Double> addition = (a,b) -> a + b;
		BiFunction<Double,Double,Double> substraction = (a,b) -> a - b;
		BiFunction<Double,Double,Double> multiplication = (a,b) -> a * b;
		BiFunction<Double,Double,Double> division = (a,b) -> a / b;
		
		System.out.println("Addition: " + LambdaBiFunction.executeOperation(addition,4.0,5.0));
		System.out.println("Substraction: " + LambdaBiFunction.executeOperation(substraction,4.0,5.0));
		System.out.println("Multiplication: " + LambdaBiFunction.executeOperation(multiplication,4.0,5.0));
		System.out.println("Division: " + LambdaBiFunction.executeOperation(division,4.0,5.0));

	}
	
	static Double executeOperation(BiFunction<Double,Double,Double> operation, Double ope1, Double ope2) {
		return operation.apply(ope1,ope2);
	}

}

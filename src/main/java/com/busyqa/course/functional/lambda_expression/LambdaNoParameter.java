package com.busyqa.course.functional.lambda_expression;

interface Sayable1 {
	public String say();
}

public class LambdaNoParameter {
	public static void main(String[] args) {
		Sayable1 s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
	}
}

package com.qa.Calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(additon(1, 2));
		System.out.println(subtraction(1, 2));
		System.out.println(multiplication(4, 2));
		System.out.println(division(4, 2));
	}
	
	public static int additon(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double division(double num1, double num2) {
		return num1 / num2;
	}
}

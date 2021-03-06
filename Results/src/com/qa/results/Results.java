package com.qa.results;

public class Results {
	public static int chemistry;
	public static int physics;
	public static int biology;
	public static int total;
	public static int percentage;
	
	public static void main(String[] args) {
		int result = method1(100, 100, 100);
		method2(result);
	}
	
	public static int method1(int mark1, int mark2, int mark3) {
		chemistry = mark1;
		physics = mark2;
		biology = mark3;
		total = chemistry + physics + biology;
		System.out.println("Student achieved: " + chemistry + " in chemistry, "
				+ physics + " in physics, " + biology + " in biology."
				+ " For a total of: " + total + " marks.");
		return total;
	}
	
	public static void method2(int total) {
		int percentage = (total * 100) / 450;
		System.out.println("The student achieved: " + percentage + "% overall.");
	}
}

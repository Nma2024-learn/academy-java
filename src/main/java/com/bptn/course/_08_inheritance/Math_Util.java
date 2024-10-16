package com.bptn.course._08_inheritance;

public class Math_Util {
	public MathUtil() {
		addCount();
	}
	
// Create a counter which will keep a track of
//	the number of visits	
	static int count;
	
	static void addCount() {
		count++;
	}
	
//	static dataType propertyName;
	static double valueOfPi = 3.14;
	
//	static returnType methodName;
	static int add(int a, int b) {
		return a + b;
	}
	
	public void displayData() {
		System.out.println("Object created!");
	}
	
}
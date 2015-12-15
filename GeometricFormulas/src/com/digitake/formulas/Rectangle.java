package com.digitake.formulas;

import java.util.Scanner;

public class Rectangle {

	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//
	// area();
	//
	//
	// }
	//
	// public static void area(){
	//
	// double lenght= 20;
	// double width= 10;
	//
	// double area=(lenght*width);
	//
	// System.out.println("area of the rectangle="+area);
	//
	// System.out.println("Enter lenght 20");
	//
	// System.out.println("Enter width 10");
	//
	//
	//
	// // System.out.println
	//
	//
	// }

	public static double CircleArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static double RectangleArea(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the radius of the circle: ");
		double blu = keyboard.nextDouble();
		System.out.print("Input the length of the rectangle: ");
		double len = keyboard.nextDouble();
		System.out.print("Input the width of the rectangle: ");
		double wid = keyboard.nextDouble();
		System.out.println("Circle Area = " + CircleArea(wid));
		System.out.println("Rectangle Area = " + RectangleArea(len, wid));
	}

}

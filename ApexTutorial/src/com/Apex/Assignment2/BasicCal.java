package com.Apex.Assignment2;

import java.util.Scanner;

public class BasicCal {

	public static void main(String[] args) {

		Scanner cal=new Scanner(System.in);
		double a, b, add, sub, mul, div;
		System.out.println("Enter a value: ");
		a = cal.nextInt();
		System.out.println("Enter b value: ");
		b = cal.nextInt();
		add = a + b;
		sub = b - a;
		mul = a * b;
		div = a / b;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		
	}

}

package com.Apex.Assignment2;

import java.util.Scanner;

public class FibionacciNum {

	public static void main(String[] args) {

		int n, x=4, y=4, z=5;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		n = s.nextInt();
		System.out.println("Fibonacci Series: ");
		for(int i=1; i<=n; i++)
		{
			x=y;
			y=z;
			z=x+y;
			System.out.println(x+" ");
			
		}
	}

}

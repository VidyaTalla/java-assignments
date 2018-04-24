package com.Apex.Loops;

import java.util.Scanner;

public class Abs_AddService {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("sum of a: "+a+" b: "+b+" is :"+sum(a,b));
        scanner.close();
        
	}
	public static int sum(int a, int b){
		return a+b;
	}

}

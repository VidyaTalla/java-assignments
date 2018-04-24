package com.Apex.Loops;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {

		int num,fact=1;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = ip.nextInt();
		if(num<=0)
			System.out.println("FactorialNum is not defined");
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact *= i;
			}
			System.out.println("FactorialNum of" + num + " = " + fact);
		}
		
		}
				
	}



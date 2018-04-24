package com.Apex.Loops;

public class WhileLoopEx3 {

	public static void main(String[] args) {

		//create another program same as exercise 1 for sum of square of first n numbers
		//Note: do two ways 1^2+2^2+3^2+4^2....n or n(n+1)(2n+1)/6
        /**
		 int i = 0;
		 i=i+1;
		 while(i > 0){
			 System.out.println(i);
			 
			 i=(i*i);
			*/

		int n = 5;
		int sum = n;
		while(n >= 5){
			System.out.println(n);
			sum = n;
           // n=(n*n)+sum*(n-1);			
		   n = (n*(n+1)*(2*n+1))/6;
			 
		 }
		 
	}

	}



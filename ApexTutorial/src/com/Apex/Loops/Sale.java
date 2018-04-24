package com.Apex.Loops;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("OriginalPrice before discount: ");
		double originalPrice=in.nextDouble();
		double discountRate = 0.5;
		
		if(originalPrice < 100){
			discountRate= 0.5;
			
		}
		double discountedPrice = originalPrice - discountRate;
		
		System.out.printf("Discounted price: %.5f\n",discountedPrice);
	}

}

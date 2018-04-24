package com.Apex.Loops;

import java.util.Scanner;

public class DiscountSale {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
        double itemPrice, discount, discountedPrice;
		int cookies;
		int cakes;
		System.out.println("enter the number of cookies ");
		cookies = input.nextInt();
		System.out.println("enter the number of cakes ");
		cakes = input.nextInt();
		itemPrice=cookies*0.5 + cakes*0.3;
		
		if(itemPrice>10){
			discount = itemPrice*5/100;
			discountedPrice = itemPrice - discount;
			System.out.println("the final item price is: "+discount);
		}else{
			System.out.println("the final item price is: "+itemPrice);
		}
		input.close();
	}
		
}

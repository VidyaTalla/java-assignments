package com.Apex.Assignment2;

import java.util.Scanner;

public class IsEveOdd {

	public static void main(String[] args) {

			      int number;
			      System.out.println("Enter an integer to check if it is odd or even: ");
			      Scanner input = new Scanner(System.in);
			      number = input.nextInt();
			      isOdd(number);

			      boolean answer=isOdd(number);
			      if (answer=true)
			      {
			          System.out.println("EVEN");
			      }

			      if (answer=false)
			      {
			          System.out.println("ODD");
			      }



			   }
			   public static boolean isOdd(int number)
			   { 
			    if(number % 2 == 0)
			   {				
			        return true;
			    }
			    return false;

			}

	}



package com.Apex.Loops;

import java.util.Scanner;

public class TreeDesign {
	
	int i,j,k,number;
	Scanner user_input;
	public TreeDesign()
	{
		user_input=new Scanner(System.in);
		System.out.print("Enter no of Layers in Pyramid :");
		number=user_input.nextInt();
		
	    for(i=1; i<=number; i++){
	    	for(j=i;j<number;j++)
	    		System.out.print(" ");
	    	for(k=1;k<(i*2);k++)
	    		System.out.print("*");
	    	    System.out.print("\n");
	    }
	    for(i=0;i<3;i++)
	    {
	    	for(number=0;number<12/2;number++)
	    	System.out.print(" ");
	    	System.out.print("***");
	    	System.out.println("\n");
	    }
	}
	public static void main(String[] args) {
		TreeDesign obj=new TreeDesign();
		

	}

}

package com.Apex.Loops;

public class ForLoopEx1 {

	public static void main(String[] args) {
		 
		double x= 1.2;
		double y= 3.4;
		double total=0.0;
		
		for (int i=0; i<=3; i++){
			if (i<=x){
				total=total+getSum(x,y);
			}else{
				total=total+getSum(total,x);
			}
			
			}
		System.out.println("The total is: "+total);
			
			}
	   public static double getSum(double num1, double num2){
		double sum;
		System.out.println("The two values are: "+num1+" "+num2);
		sum= num1+num2;
		return sum;
		}

	}


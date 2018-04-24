package com.Apex.Assignment2;

public class GenMulNum {

	public static void main(String[] args) {

		int mulOf5 = 0;
		
		for(int a = 1; a < 1000; a++){
			if(a % 5 == 0)
				mulOf5 += a;
		}
		System.out.println(mulOf5);
	}

}

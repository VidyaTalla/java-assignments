package com.Apex.Assignment3;
//Find the pair of numbers who sum is a give values
//[1,2,3,4,5,6,7,8,9] sum n=10.
import java.util.HashMap;
import java.util.Map;

public class PairOfSum {

	public static void main(String[] args) {

		int []n = {1,2,3,4,5,6,7,8,9};
		printSumPairs(n,10);
	}
	
	public static void printSumPairs(int []input, int k){
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		
		for(int i=0; i<input.length; i++)
		{
			if(pairs.containsKey(input[i]))
			{
				System.out.println(input[i]+", "+pairs.get(input[i]));
				
			}else{
				pairs.put(k-input[i], input[i]);
			}
		}
	}
	
	}



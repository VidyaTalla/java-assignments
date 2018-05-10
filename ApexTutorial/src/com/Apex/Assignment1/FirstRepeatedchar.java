package com.Apex.Assignment1;

import java.util.HashSet;

//Find first repeated chatacter in a string
public class FirstRepeatedchar {
	static char Repeat(char str[])//This function prints the first repeated character in str[]
	{
		    //Creates an empty hashset
		HashSet<Character> h=new HashSet<>();
		   //Traverse the input array from left to right
		for(int i=0; i<=str.length-1; i++)
		{
			char c = str[i];
			  //If element is already in hash set, update x
			  //and then break
			if(h.contains(c))
			{
				return c;
			}else{    //Else add element to hash set
				h.add(c);
			}
			
		}
		return '\0';
	}
        //Driver method to test above method
	public static void main(String[] args) {
		String str = "Ecommerce";
		char[] arr = str.toCharArray();
		System.out.println(Repeat(arr));
		
	}

}

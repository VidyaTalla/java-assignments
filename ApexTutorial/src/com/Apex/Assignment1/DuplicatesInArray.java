package com.Apex.Assignment1;
//Find the duplicate data from the pair of duplicates
import java.util.HashSet;

public class DuplicatesInArray {

	public static void main(String[] args) {

		String[] strArray = {"1","1","2","2","3","3","4","4","4","4","5"};
		HashSet<String> set =new HashSet<String>();
		for(String arrayElement : strArray)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is "+arrayElement);
			}
		}
		
	}

}

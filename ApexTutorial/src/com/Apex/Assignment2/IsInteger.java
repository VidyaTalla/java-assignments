package com.Apex.Assignment2;

public class IsInteger {

	public static void main(String[] args) {
		 
		String[]  input = {"lmn", "7i","24","A4","10%","2.45"};
		 
		for (int i=0; i<input.length; i++) {
        boolean isInteger = isInteger(input[i]);
        if (isInteger) {
             System.out.println(input[i]+" is an integer");
              } else {
	           System.out.println(input[i]+" is not an integer");
	          }
            }
		 
		   }

	   public static boolean isInteger(String s) {
		 boolean isValidInteger = false;
	      try
	      {
	      Integer.parseInt(s);
          isValidInteger = true;
	      }
	      catch (NumberFormatException ex){
	    	  //s is not an integer;
	      }
	      return isValidInteger;
	   }
			
	}
		 
		
	



package com.Apex.Demo;
class JobApplication1{
	//instance
	String firstName;
	String lastName;
	int year;
	
	//class level data
	static String companyName = "Google";
	
	//methods
	//Constructor
	JobApplication1(){
		firstName = "DEFAULT";
		lastName = "DEFAULT";
		year = 1980;
	}
	JobApplication1(String fn, String ln, int y){
	}
	
	public void display() {
		System.out.println(firstName+" "+lastName+"\n"+year);
	}
	     

public static class JobApplication {

	public String firstName;
	public String lastName;
	public String Year;
	public String companyName;

	public static void main(String[] args) {
     JobApplication jobApplication = new JobApplication();
     jobApplication.firstName = "Vidya";
     jobApplication.lastName = "T";
     jobApplication.Year = "1980";
     jobApplication.companyName = "abc.com";
     System.out.println("Company name : "+jobApplication.companyName);
     jobApplication.display();
	}

	private void display() {
		System.out.println("companyName");
	}

     
	}

}

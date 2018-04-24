package com.Apex.Assignment2;


class Employee{
	int EmpNo;
	String EmpName;
	String Address;
	String State;
	int ZipCode;
	int Phone;
	String Designation;
	int ExperiencianYears;
	String emailAddress;
	int Basic;
	int hra;
	int bonus;
	void insert(int No,String Name, String A, String S, int Z, int Ph, String Desig, int Yrs, String email, int B,int h, int Bo ){
	    EmpNo = No;
		EmpName = Name;
		Address = A;
		State = S;
		ZipCode =Z;
		Phone = Ph;
		Designation = Desig;
		ExperiencianYears = Yrs;
		 emailAddress = email;
		 Basic = B;
		 hra = h;
		 bonus = Bo;
	}
	void display(){
		System.out.println(EmpNo+"\n"+EmpName+"\n"+Address+"\n"+State+"\n"+ZipCode+"\n"+Phone +"\n"+Designation+"\n");
	    System.out.println(ExperiencianYears+"\n"+emailAddress+"\n"+Basic+"\n"+hra+"\n"+bonus);
	    
	}
	
		
	}


public class Employee_details {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.insert(2012, "sita", "Mowry Ave", "Fremont", 94538, 781234534, "Test Engineer", 5, "ra_123@gmail.com", 6000, 1000, 1000);
		emp1.display();
		
		
	}

}

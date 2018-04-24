package com.Apex.Assignment2;

public class Details {
	private int empNo;
	private String empName;
	private int address;
	private String state;
	private int zipCode;
	private String phone;
	private String designation;
	private int experiencienYears;
	private String emailAddress;
	private int basic;
	private int hra;
	private int bonus;
	
	public int getEmpNo(){
		return empNo;
	}
	
	public String getEmpName(){
		return empName;
	}
	public int getAddress(){
		return address;
	}
	public String getState(){
		return state;
	}
	public int getZipCode(){
		return zipCode;
	}
	public String getPhone(){
		return phone;
	}
	public String getDesignation(){
		return designation;
	}
	public int getExperiencienYears(){
		return experiencienYears;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public int getBasic(){
		return basic;
	}
	public int getHra(){
		return hra;
	}
	public int getBonus(){
		return bonus;
	}
	
	public void setempNo(int empNoGiven){
		empNo = empNoGiven;
	}
	public void setEmpName(String empNameGiven){
		empName = empNameGiven;
	}
	public void setAddress(int addressGiven){
		address = addressGiven;
	}
	public void setState(String stateGiven){
		state = stateGiven;
	}
	public void setZipCode(int zipCodeGiven){
		zipCode = zipCodeGiven;
	}
	public void setPhone(String phoneGiven){
		phone = phoneGiven;
	}
	public void setDesignation(String designationGiven){
		designation = designationGiven;
	}
	public void setExperiencienYears(int experiencienYearsGiven){
		experiencienYears = experiencienYearsGiven;
	}
	public void setEmailAddress(String emailAddressGiven){
		emailAddress = emailAddressGiven;
	}
	public void setBasic(int basicGiven){
		basic= basicGiven;
	}
	public void setHra(int hraGiven){
		hra = hraGiven;
	}
	public void setBonus(int bonusGiven){
		bonus = bonusGiven;
	}
	
	public Details(){
		empNo = 0;
		empName = "";
		address = 0;
		state = "";
		zipCode = 000000;
		phone = "(000) 479-3489";
		designation = "";
		experiencienYears = 0;
		emailAddress = "";
		basic = 0;
		hra = 0;
		bonus = 0;
		
		

	


		
	}

}

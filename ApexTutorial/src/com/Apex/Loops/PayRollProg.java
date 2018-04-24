package com.Apex.Loops;

import javax.swing.JOptionPane;

public class PayRollProg {

	public static void main(String[] args) {

		//get user input
		String employeeName = getInput("please enter your name: ");
		String hoursWorkedString = getInput("please enter the hours worked in month: ");
		String hourlyRateString = getInput("please enter your hourly rate: ");
		String fedTaxRateString = getInput("please enter your federal Tax without holding details: ");
		String stateTaxRateString = getInput("please enter your State Tax with holding details: ");
		
		//parse our strings to double data type
		Double hoursWorked = Double.parseDouble(hoursWorkedString);
		Double hourlyRate = Double.parseDouble(hourlyRateString);
		Double fedTaxRate = Double.parseDouble(fedTaxRateString);
		Double stateTaxRate = Double.parseDouble(stateTaxRateString);

		
		
		//perform calculations
		Double grossPay = hourlyRate * hoursWorked;
		Double fedTax = grossPay * fedTaxRate;
		Double stateTax = grossPay * stateTaxRate;
		Double totalDeduction = fedTax + stateTax;
		Double netPay = hourlyRate - hoursWorked;
		
		//Generate output
		String outputString = null;
		outputString += "Employee Name: " + employeeName + "\n";
		outputString += "\nHoursWorked: " + hoursWorkedString + "\n";
		outputString += "payRate: " + hourlyRateString + "\n";
		outputString += "Gross Pay: " + grossPay.toString();
		outputString += "Deductions:\n ";
		outputString += "Federal withholding: ("+ (fedTaxRate * 100) + "%):" + fedTax.toString()+"\n";
		outputString += "State withholding: ("+ (stateTaxRate * 100) + "%):" + stateTax.toString()+"\n";

		outputString += "totalDeductions: " + totalDeduction.toString()+"\n";
		outputString += "Gross Pay: " + grossPay.toString();
		outputString += "NetPay: " + netPay.toString();

		//display the results in a dialogue box
		JOptionPane.showMessageDialog(null, outputString);
		
		//display result in the console
		System.out.println(outputString);
	}

	private static String getInput(String message) {
		String input =JOptionPane.showInputDialog(message);
		 
		return input;
	}
}
		

		
		

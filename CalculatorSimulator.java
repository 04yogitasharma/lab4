package lab4;

class CountryNotValidException extends Exception{
	public CountryNotValidException(String message) {
		super(message);
	}
}

class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String message) {
		super(message);
	}
}

class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}

class TaxCalculator{
	public static double calculateTax(String empName,Boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
		if(isIndian==false) {
			throw new CountryNotValidException("Country should be Indian ");
		}
		if(empName==null&&empName.trim().isEmpty()) {
			throw new EmployeeNameInvalidException("Employee name cannot be null or empty");
		}
		
		double taxAmount=0;
		if(empSal>100000) {
			taxAmount=empSal*8/100;
		}
		else if(empSal>=50000&&empSal<=100000) {
			taxAmount=empSal*6/100;
		}
		else if(empSal>=30000&&empSal<=50000) {
			taxAmount=empSal*5/100;
		}
		else if(empSal>=10000&&empSal<30000) {
			taxAmount=empSal*4/100;
		}
		else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		return taxAmount;
	}
}

public class CalculatorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator taxCalculator=new TaxCalculator();
		
//		Test case1
		
		try {
			System.out.println("Test case 1");
			double TaxAmount=TaxCalculator.calculateTax("Rohan",false,34000);
			System.out.println("The amount is "+TaxAmount);
		}
		catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
//		Test case 2
		try {
			System.out.println("Test case 1");
			double TaxAmount=TaxCalculator.calculateTax("tim",true,1000);
			System.out.println("The amount is "+TaxAmount);
		}
		catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
//		test case 3
		
		try {
			System.out.println("Test case 1");
			double TaxAmount=TaxCalculator.calculateTax("jack",true,55000);
			System.out.println("The amount is "+TaxAmount);
		}
		catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
//		test case 4
		
		try {
			System.out.println("Test case 1");
			double TaxAmount=TaxCalculator.calculateTax("",true,30000);
			System.out.println("The amount is "+TaxAmount);
		}
		catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
	}

}
///*
// * Problem Statement 1: Develop a simple java application to calculate the tax
// * for a particular employee based on his salary. Develop a class named
// * “TaxCalculator“ with a method named calculateTax with the following method
// * parameters, Variable Name Data Type empName String isIndian boolean empSal
// * double This method should return a double taxAmount. The business logic for
// * calculating the tax is as follows, this has to be implemented inside the
// * method, If the employee is not a Indian The calculator should throw a
// * CountryNotValidException If the employee name is null or empty The calculator
// * should throw a EmployeeNameInvalidException If empSal is greater than one
// * lakh and isIndian true taxAmount =empSal *8/100 Otherwise If empSal is
// * between 50K and 1lakh and isIndian true taxAmount =empSal *6/100 Otherwise If
// * empSal is between 30 and 50 Thousand and isIndian true taxAmount =empSal
// * *5/100 Otherwise If empSal is between 10 and 30 Thousand and isIndian true
// * taxAmount =empSal *4/100 Otherwise The calculator should throw a
// * TaxNotEligibleException. Develop a main class CalculatorSimulator , implement
// * the following logic in main method 1. Execute the calculateTax Method and
// * print the tax amount as “Tax amount is “ 2. In case the calculateTaxMethod
// * throws exceptions, this method needs to catch the appropriate exception print
// * the stack trace and display the following messages, a. Country not valid:
// * “The employee should be an Indian citizen for calculating tax” b. Employee
// * name not valid: “The employee name cannot be empty” c. Not eligible for Tax
// * calculation: “The employee does not need to pay tax” The following test cases
// * to be executed, change the data in main method and run it and verify the
// * output messages Test Cases Employee Name Employee Salary Is Indian Message
// * Expected Test Case 1 Ron 34000 False The employee should be an Indian citizen
// * for calculating tax. Test Case 2 Tim 1000 True The employee does not need to
// * pay tax Test Case 3 Jack 55000 True Tax amount is 3300 Test Case 4 30000 True
// * The employee name cannot be empty.
// */
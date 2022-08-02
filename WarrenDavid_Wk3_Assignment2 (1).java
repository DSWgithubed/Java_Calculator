// This program will take the user input and determine what operation to perform
//The program will ask the user for two numbers and an operator symbol to decide what operation to do
import java.util.Scanner;//bring in the scanner
public class WarrenDavid_Wk3_Assignment2 {

	public static void main(String[] args) {
    
	Scanner doubleScan = new Scanner(System.in);// open the number scanner
	Scanner operatorScan = new Scanner(System.in);//open the operator scanner
	
	System.out.println("This program will accept (2) numbers as input and make calculations");
	System.out.println("Enter your first number: ");
	double num1 = doubleScan.nextDouble();//Get first number
	
	System.out.println("Enter your second number: ");
	double num2 = doubleScan.nextDouble();//Get second number
	
	System.out.println("Enter your operator for example +, -,*, or /: ");
	String operator = operatorScan.nextLine();//Get operator selection
	
	
	
	if (operator.equals("+") ) {
		double addition = (num1 + num2);//perform addition 
		System.out.println(num1 + " + " + num2 + "   = " + addition);//print out addition statement
	    }
	else if (operator.equals("-") ) {
		double subtraction = (num1 - num2);//perform subtraction
		System.out.println(num1 + " - " + num2 + " = " + subtraction);// print out subtraction statement
	    }
	else if  (operator.equals("*")) {
		double multiply = (num1 * num2); //perform multiplication 
		System.out.println(num1 + " * " +  num2 + " = " + multiply);//print out multiplication
	    }
	else if (operator.equals("/")) {
		double divide = (num1/num2);//perform division
		System.out.print(num1 + " / " + num2 + " = " + divide);//print out division statement
	    
	}
	else System.out.println("***Error invalid input for operator***");
    System.out.println("\nDavid Warren, CMIS 140 November 09, 2021");	
	doubleScan.close();//close scanner for double
	operatorScan.close();//close scanner for operator 
	}
	


}

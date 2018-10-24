// Program:	Loan_Payment_Calculator.java
// Purpose: This program calculates monthly loan payments including interest.
// Author:	Brian Vojtko	
// Date:	10/24/2018
import java.text.DecimalFormat;
import java.util.Scanner;

public class Loan_Payment_Calculator {

	public static void main(String[] args){
	
		//Make outputs in 2 decimals
		DecimalFormat money = new DecimalFormat(".00");
		
		char decision = 'y';
		
		//Loops program if user responded with 'y'
		while (decision == 'y' || decision == 'Y') {
		
		Scanner input = new Scanner(System.in);
	
		//Integers
		double interestPercent;
		double monthlyRate;
		double totalInterest = 0;
		double payment;
		
	//User Introduction
	System.out.println("   Loan Payment Calculator");
	System.out.println("*********************************");
	
	//Amount user owes
	System.out.println("Enter the initial loan amount: ");
	double amount = input.nextDouble ();
	
		//Error Loop
		while (amount > 1000000) {
			System.out.println("the loan amount cannot exceed $1,000,000. Try again.");
			amount = input.nextDouble();
			continue;
		}
	
		//Error Loop
		while (amount <= 0) {
			System.out.println("You must enter a value greater than zero. Try again.");
			amount = input.nextDouble();
			continue;
		}
	
	//Annual Interest Rate
	System.out.println("Enter the annual interest rate (as a percentage): ");
	interestPercent = input.nextDouble();
	
	//Calculate Monthly Interest Rate
	monthlyRate = (interestPercent / 100) / 12;
	
		//Error Loop
		while (interestPercent < 2 || interestPercent > 15) {
			System.out.println("You must enter a value between 2.0 and 15.0 (inclusive). Try again.");
			interestPercent = input.nextDouble();
			continue;
		}
	
	//Amount of years user has to repay
	int years;
	System.out.println("Enter the term of the loan in years: ");
	years = input.nextInt();
	
		//Error Loop
		while (years <= 0 || years > 30) {
			System.out.println("Please enter a term between 1-30 years.");
			years = input.nextInt();
			continue;
		}
		
	//Monthly Payment Calculation
	double m = (years * 12);	
	payment = (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -m));
	
	//Monthly Payment output
	System.out.println("Your monthly payment is: $" + money.format(payment));
	
	//Line space
	System.out.println("");
	
	//Beginning of Loan Chart
	System.out.println("Month\t\tInterest\tPrincipal\tBalance");
	System.out.println("----------------------------------------------------------");
	
	//Loan Chart Calculation
	double balance = amount, principal, interest;
	
	for (int i = 1; i <= m; i++) {
		interest = monthlyRate * balance;
		principal = payment - interest;
		balance = balance - principal;
		totalInterest += interest;
	
		//User output
		System.out.println(i + "\t\t" + "$" + money.format(interest) + "\t\t" + "$" + money.format(principal) + "\t\t" + "$" + money.format(balance));
	}

	//User output for total amount of interest paid
	System.out.println("");
	System.out.println("The total amount of interest paid is: $" + money.format(totalInterest));
	System.out.println("");
	
	//Repeat Loop
	boolean yesDecision;
	boolean noDecision;
	input.nextLine();
	
	do {
		System.out.println("Do you have another loan to process? (y/n): ");
		decision = input.nextLine().charAt(0);
		yesDecision = (decision == 'y' || decision == 'Y');
		noDecision = (decision == 'n' || decision == 'N');
	} while(!(yesDecision || noDecision));
		
		System.out.println("");
	}
	System.out.println("Thank you for using our loan calculator. Goodbye!");
}
}

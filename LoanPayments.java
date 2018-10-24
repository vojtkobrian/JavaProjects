// Program:	LoanPayments.java
// Purpose: This program calculates how much of your loan payment goes to the principal and how much goes to interest.
// Author:	Brian Vojtko	
// Date:	10/09/2018

import java.util.Scanner;

public class LoanPayments 
{
public static void main(String[] args) 
	{
		//Introduction Display
		System.out.println ("Loan Payments");
		System.out.println("-----------------");
		System.out.println("This program calculates how much of your loan payment goes to the principal and how much goes to interest.");
		System.out.println(" ");
		
		Scanner scan = new Scanner(System.in);
		
		//Monthly Payment Input
		double payment = 0.00;
		System.out.println("Enter your monthly payment: $");
		payment = scan.nextDouble ();
	
		//Outstanding Balance Input
		double balance = 0.00;
		System.out.println("Enter your outstanding balance: $");
		balance = scan.nextDouble ();
		
		//Calculation
		double interest = payment * 0.0451;
		double principal = payment - interest;
		interest = (double)((int)((interest + 0.005) * 100))/100;
		principal = (double)((int)((principal + 0.005) * 100))/100;
		
		//Display Results
		System.out.println("From your payment of $" + payment + ",");
		System.out.println("$" + interest + " goes to interest.");
		System.out.println("$" + principal + " goes to the principal.");
	}
}

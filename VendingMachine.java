// Program:	VendingMachine.java
// Purpose: This program simulates a vending machine.
// Author:	Brian Vojtko	
// Date:	10/16/2018

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		
		//Integers
		int choice = 0;
		double remain = 0.00;
		double money = 0.00;
		double change = 0.00;
		double item1 = 1.25;
		double item2 = 1.75;
		double item3 = 0.90;
		double item4 = 0.75;
		double item5 = 1.50;
		double item6 = 2.00;
		
		//User Prompt
		System.out.println("    CS 570 Vending Machine");
		System.out.println("---------------------------------");
		System.out.println("1. Roasted Almonds --> $1.25");
		System.out.println("2. Pretzels --> $1.75");
		System.out.println("3. Chewing Gum --> $0.90");
		System.out.println("4. Mints --> $0.75");
		System.out.println("5. Chocolate Bar --> $1.50");
		System.out.println("6. Cookies --> $2.00");
		
		//User Input Vending Choice
		System.out.println("Enter your choice of item: ");
		choice = input.nextInt();
		
		//Error
		if (choice > 6 || choice < 1) {
			System.out.println("Error: Invalid Choice. Please try again.");
			return;
		}
		
		//User Input Money
		else 
		System.out.println("Enter money to purchase item: ");
		money = input.nextDouble();
		
		switch(choice)
		
		{
		//Choice 1
		case 1:
			
			if(money < item1) {
				remain = (double)((int)((remain + 0.005) * 100))/100;
				remain = item1 - money;
				System.out.println("You are $" + remain + " short." );
				break;
			}
			else
			change = money - item1;
			change = (double)((int)((change + 0.005) * 100))/100;
			System.out.println("Thanks for buying roasted almonds. Your change is $" + change + ".");
			
			break;
		
		//Choice 2
		case 2:
			
			if(money < item2) {
				remain = (double)((int)((remain + 0.005) * 100))/100;
				remain = item2 - money;
				System.out.println("You are $" + remain + " short." );
				break;
			}
			else
			change = money - item2;
			change = (double)((int)((change + 0.005) * 100))/100;
			System.out.println("Thanks for buying pretzels. Your change is $" + change + ".");
			
			break;
		
		//Choice 3
		case 3:
			
			if(money < item3) {
				remain = (double)((int)((remain + 0.005) * 100))/100;
				remain = item3 - money;
				System.out.println("You are $" + remain + " short." );
				break;
			}
			else
			change = money - item3;
			change = (double)((int)((change + 0.005) * 100))/100;
			System.out.println("Thanks for buying chewing gum. Your change is $" + change + ".");
			
			break;
		
		//Choice 4	
		case 4:
			
			if(money < item4) {
				remain = (double)((int)((remain + 0.005) * 100))/100;
				remain = item4 - money;
				System.out.println("You are $" + remain + " short." );
				break;
			}
			else
			change = money - item4;
			change = (double)((int)((change + 0.005) * 100))/100;
			System.out.println("Thanks for buying mints. Your change is $" + change + ".");
			
			break;
		
		//Choice 5
		case 5:
			
			if(money < item5) {
				remain = (double)((int)((remain + 0.005) * 100))/100;
				remain = item5 - money;
				System.out.println("You are $" + remain + " short." );
				break;
			}
			else
			change = money - item5;
			change = (double)((int)((change + 0.005) * 100))/100;
			System.out.println("Thanks for buying the chocolate bar. Your change is $" + change + ".");
			
			break;
		
		//Choice 6	
		case 6:
			
			if(money < item6) {
				remain = (double)((int)((remain + 0.005) * 100))/100;
				remain = item6 - money;
				System.out.println("You are $" + remain + " short." );
				break;
			}
			else
			change = money - item6;
			change = (double)((int)((change + 0.005) * 100))/100;
			System.out.println("Thanks for buying cookies. Your change is $" + change + ".");
			
			break;
		
		//Error
		default:
			System.out.println("Error: Invalid Choice. Please try again.");
			
		while (true);
		}			
	}
}

// Program:	ShippingCalculator.java
// Purpose: This program calculates the calculates and displays the total shipping charges based on the parcel’s weight and shipping rate per pound.
// Author:	Brian Vojtko	
// Date:	10/09/2018

import java.util.Scanner;

public class ShippingCalculator
{
public static void main(String[] args)
	{
		//Introduction Display
		System.out.println ("Shipping Charges Calculator");
		System.out.println("This program calculates the shipping charges of a parcel based on the parcel weight and the shipping rate per pound.");
		System.out.println(" ");

		//Weight Input
		double weight ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight of your parcel in pounds: ");
		weight = scan.nextDouble ();

		//Shipping Price Input
		double price = 0.00 ;
		System.out.println("Enter the shipping price per pound: ");
		price = scan.nextDouble ();
		
		//Calculation
		double charges = weight * price;
		charges = (double)((int)((charges + 0.005) * 100))/100;
		
		//Display Results
		System.out.println("The weight of your parcel is: " + weight + " pounds");
		System.out.println("The shipping price per pound is: $" + price);
		System.out.println("The shipping charges for your parcel is $" + charges );
	}
}
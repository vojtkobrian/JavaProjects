// Program:	Binary_Representation.java
// Purpose: Writes a recursive method that converts a number from its decimal representation to its binary representation.
// Author:	Brian Vojtko	
// Date:	10/24/2018
import java.util.Scanner;

public class Binary_Representation {
	
	public static void binConv(int number) {
		
		if (number > 0 ) {
		binConv(number / 2);
		System.out.print(number % 2);
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		
		while(loop) {
		
	System.out.print("Enter a positive integer or 0 to end: ");
	int number = input.nextInt();
	
	while (number < 0) {
    	System.out.println("Error: You entered a negative value. Try again.");
    	number = input.nextInt();
		continue;
	}
	
	if (number == 0) {
		System.out.println("Goodbye");
		return;
		}
	
		System.out.print(number + " in binary is ");
		binConv(number);
	
	if (number >= 1) {
		loop = true;
		System.out.println("");
	}
	else {
		loop = false;
	}
	}
	}
}
	

// Program:	JavaSentences.java
// Purpose: This program reads a one-line sentence as input from the user and then displays various responses.
// Author:	Brian Vojtko	
// Date:	10/16/2018

import java.util.Scanner;

public class JavaSentences 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		//User Prompt
		System.out.println("Enter Sentence: ");
		
		//Identifiers
		String sentence = sc.nextLine();
		int sLen = sentence.length();
		String sentenceEnd = sentence.substring(sLen-1, sLen);
		
		//Output
		if (sentenceEnd.equals("?") & (sLen % 2 == 0))
			System.out.println("Yes");
		else if (sentenceEnd.equals("?") & (sLen % 2 != 0))
			System.out.println("No");
		else if (sentenceEnd.equals("!")) 
			System.out.println("Wow");
		else
			System.out.println("You always say " + sentence + ".");
	}
}
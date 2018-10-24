// Program:	MotorBoat.java
// Purpose: This program calculates a motorboats fuel efficiency through distance.
// Author:	Brian Vojtko	
// Date:	10/16/2018

import java.util.Scanner;

public class Motorboat {
		Scanner input = new Scanner(System.in);
		
		//Integers
		private double tankCapacity = 50;
		private double fuelInTank = 0;
		private double maxSpeed = 90;
		double currentSpeed = 0;
		private double motorEfficiency = 0.43;
		double distanceTraveled = 0;
		
		//Constructor that sets the tank level, speed, and efficiency
	    public void start(double tankLevel, double speed, double efficiency) {
	    	tankCapacity = tankLevel;
	    	fuelInTank = 0;
	    	maxSpeed = speed;
	    	currentSpeed = 0;
	    	motorEfficiency = efficiency;
	    	distanceTraveled = 0;
	    }
	    
	    //Integers placed in Constructors
	    double fuelLeft;
	    double gallonsLeft = motorEfficiency * (maxSpeed/2);
	    double gallonsLeftRefuel = (motorEfficiency * (maxSpeed/2) + 10);
	    
	    //Set the fuel tank
	    public double tank() {
	    	return tankCapacity;
	    }
	   
	    //Set the speed of the boat
	    public double userSpeed(){
	    	return maxSpeed;
	    }
	    
	    //Amount of fuel remaining
	    public double fuelRemaining () {
	    	return fuelLeft;
	    }
	    
	    //Amount of fuel remaining after distance
	    public double efficient () {
	    	return gallonsLeft;
	    }
	    
	    //Distance traveled
	    public double distance () {
	    	return maxSpeed/2;
	    }
	    
	    //Fuel after refill
	    public double refuel () {
	    	return gallonsLeftRefuel;
	    }
}    


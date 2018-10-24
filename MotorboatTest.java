public class MotorboatTest {

	public static void main(String[] args) {
		
			Motorboat myBoat = new Motorboat();
			//Starting Settings
			myBoat.start(15, 55, 0.43);
			
			//User Prompt
			System.out.println("Testing the Motorboat Class");
			System.out.println("----------------------------");
			
			//Boat Information
			System.out.println("My boat has " + myBoat.tank() + " gallons in its tank.");
			System.out.println("We are traveling at " + myBoat.userSpeed() + " miles per hour.");
			System.out.println("After traveling for 30 minutes, there are " + myBoat.efficient() + " gallons in the tank.");
			System.out.println("And we have traveled " + myBoat.distance() + " miles.");
			
			//If tank is low, message to refuel
			if (myBoat.tank() < 20) {
				System.out.println("We need to refuel before traveling back.");
				System.out.println("Lets get 10 more gallons.");
				System.out.println("After refueling, we have " + myBoat.refuel() + " gallons in the tank.");
		}
			else 
				System.out.println("Ready to go back!");
		}	
	}

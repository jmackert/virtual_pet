package virtual_pet;

import java.util.Scanner;

public class Virtual_Pet_App {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Virtual_Pet pet = new Virtual_Pet();
		boolean isRunning = true;
		while (isRunning) 
		{
			pet.getTimePassed();
			pet.getHungerLevel();
			System.out.println("");
			pet.increaseTimePassed();
			pet.increaseHungerLevel();
			if(pet.hungerLevel > 0) {
				
				System.out.println("Would you like to feed your animal? yes/no");
				String interact = input.next();
				if(interact.contentEquals("yes")) {
					pet.decreaseHungerLevel();
					System.out.println("");
				}
				else {
					System.out.println("did not feed animal");
				}
				
			}
			System.out.println("would you like to quit? yes/no");
			String quitGame = input.next();
			if(quitGame.contentEquals("yes")) {
				isRunning = false;
			}
			
		}

	}

}

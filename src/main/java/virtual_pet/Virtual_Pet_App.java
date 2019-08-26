package virtual_pet;

import java.util.Scanner;

public class Virtual_Pet_App {
	static Scanner input = new Scanner(System.in);
	static Virtual_Pet pet = new Virtual_Pet();
	static boolean isRunning = true;

	public static void displayStatsMenu() {
		
		//Name           
		// _______________
		//|               |
		//|Hunger         |
		//|Thirst         |
		//|Boredom        |
		//|Tiredness      |
		//|_______________|
		pet.getTimePassed();
		pet.getNameOfPet();
		System.out.println("");
		System.out.println(" _______________");
		System.out.println("|               |");
		System.out.print("|");
		pet.getHungerLevel();
		System.out.print("      |");
		System.out.println("");
		System.out.print("|");
		pet.getThirstLevel();
		System.out.print("      |");
		System.out.println("");
		System.out.print("|");
		pet.getBoredomLevel();
		System.out.print("     |");
		System.out.println("");
		System.out.print("|");
		pet.getTirednessLevel();
		System.out.print("   |");
		System.out.println("");
		System.out.println("|_______________|");
	}
	public static void displayInteractionMenu() {
		
		System.out.println("What would you like to do?");
		System.out.print("1: Feed ");
		pet.getNameOfPet();
		System.out.println("");
		System.out.print("2: Water ");
		pet.getNameOfPet();
		System.out.println("");
		System.out.print("3: Play with ");
		pet.getNameOfPet();
		System.out.println("");
		System.out.print("4: Have ");
		pet.getNameOfPet();
		System.out.println(" sleep");
		System.out.println("5: Do nothing");
		System.out.println("6: QUIT");
		int interaction = input.nextInt();
		switch(interaction) {
		case 1:
			pet.decreaseHungerLevel();
			break;
		case 2:
			pet.decreaseThirstLevel();
			break;
		case 3:
			pet.decreaseBoredomLevel();
			break;
		case 4:
			pet.decreaseTirednessLevel();
			break;
		case 5:
			pet.increaseTimePassed();
			break;
		case 6:
			isRunning = false;
			default:
				pet.increaseTimePassed();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your pet's name: ");
		String name = input.nextLine();
		pet.setNameOfPet(name);		
		while (isRunning) 
		{
			displayStatsMenu();
			displayInteractionMenu();	
		}
	}
}

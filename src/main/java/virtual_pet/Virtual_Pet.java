package virtual_pet;

public class Virtual_Pet {
	String nameOfPet;
	int hungerLevel = 0;
	int timePassed = 1;
	int thirstLevel = 0;
	int boredomLevel = 0;
	int tirednessLevel = 0;
	
	public void setNameOfPet(String name) {
		this.nameOfPet = name;
	}
	public void getNameOfPet() {
		System.out.print(nameOfPet);
	}
	public void increaseTimePassed() {
		timePassed++;
	}
	public void getTimePassed()
	{
		System.out.println("Time passed is: " + timePassed);
	}
	public void increaseHungerLevel() {
		hungerLevel++;
	}
	public void getHungerLevel() {
		if(timePassed % 2 == 0)
		{
			hungerLevel++;
		}
		System.out.print("Hunger: " + hungerLevel);
	}
	public void decreaseHungerLevel() {
		System.out.println(nameOfPet +" has been fed");
		hungerLevel = 0;
		increaseThirstLevel();
		increaseTimePassed();
		increaseTirednessLevel();
	}
	public void increaseThirstLevel() {
		thirstLevel++;
	}
	public void getThirstLevel() {
		if(timePassed % 2 == 0) {
			thirstLevel++;
		}
		System.out.print("Thirst: " + thirstLevel);
	}
	public void decreaseThirstLevel() {
		thirstLevel = 0;
		increaseTimePassed();
		increaseHungerLevel();
	}
	public void increaseBoredomLevel() {
		boredomLevel++;
	}
	public void getBoredomLevel() {
		if(timePassed % 2 == 0) {
			boredomLevel++;
		}
		System.out.print("Boredom: " + boredomLevel);
	}
	public void decreaseBoredomLevel() {
		boredomLevel = 0;
		increaseThirstLevel();
		increaseHungerLevel();
		increaseTimePassed();
		increaseTirednessLevel();
	}
	public void getTirednessLevel() {
		if(timePassed % 2 == 0) {
			tirednessLevel++;
		}
		System.out.print("Tiredness: " + tirednessLevel);
	}
	public void increaseTirednessLevel() {
		tirednessLevel++;
	}
	public void decreaseTirednessLevel() {
		tirednessLevel = 0;
		increaseTimePassed();
		increaseBoredomLevel();
		increaseHungerLevel();
		increaseThirstLevel();
	}
}

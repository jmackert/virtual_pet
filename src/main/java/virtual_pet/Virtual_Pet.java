package virtual_pet;

public class Virtual_Pet {
	int hungerLevel = 0;
	int timePassed = 0;
	int thirstLevel = 0;
	int boredomLevel = 0;
	int tirednessLevel = 0;

	public void increaseTimePassed() {
		timePassed++;
	}
	public void getTimePassed()
	{
		System.out.println("Time passed is: " + timePassed);
	}
	public void increaseHungerLevel() {
		if(timePassed % 2 == 0)
		{
			hungerLevel++;
		}
	}
	
	public void getHungerLevel() {
		System.out.println("Hunger level is: " + hungerLevel);
	}
	
	public void decreaseHungerLevel() {
		System.out.println("Animal has been fed");
		hungerLevel = 0;
		thirstLevel++;
		increaseTirednessLevel();
		getHungerLevel();
	}
	public void increaseThirstLevel() {
		if(timePassed % 2 == 0) {
			thirstLevel++;
		}
	}
	public void getThirstLevel() {
		System.out.println("Thirst level is: " + thirstLevel);
	}
	public void decreaseThirstLevel() {
		thirstLevel = 0;
		increaseHungerLevel();
		getThirstLevel();
	}
	public void increaseBoredomLevel() {
		if(timePassed % 2 == 0) {
			boredomLevel++;
		}
	}
	public void getBoredomLevel() {
		System.out.println("Boredom level is: " + boredomLevel);
	}
	public void decreaseBoredomLevel() {
		boredomLevel = 0;
		thirstLevel++;
		hungerLevel++;
		increaseTirednessLevel();
		getBoredomLevel();
	}
	public void getTirednessLevel() {
		System.out.println("Tiredness level is: " + tirednessLevel);
	}
	public void increaseTirednessLevel() {
		if(timePassed % 2 == 0) {
			tirednessLevel++;
		}
	}
	public void decreaseTirednessLevel() {
		tirednessLevel--;
		increaseBoredomLevel();
		increaseHungerLevel();
		increaseThirstLevel();
	}
}

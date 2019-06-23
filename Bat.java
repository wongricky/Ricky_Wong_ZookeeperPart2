package com.zookeeper;

public class Bat extends Mammal{
	
	public Bat(){
		super();
        super.energyLevel = 300;
	}
	
	public int fly() {
		energyLevel -= 50;
		System.out.println("Flap flap flap...the bat is taking off!");
		return energyLevel;
	}
	
	public int eatHumans() {
		energyLevel += 25;
		System.out.println("Someone from town has disappeared...");
		return energyLevel;
	}
	
	public int attackTown() {
		energyLevel -= 100;
		System.out.println("Crackle crackle crackle...the town is on fire!");
		return energyLevel;
	}

}

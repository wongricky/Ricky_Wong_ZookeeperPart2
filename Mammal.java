package com.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		if (energyLevel > 1) {
			System.out.println("Current energy level is: " + energyLevel);
		}
		else {
			System.out.println("Energy level is " + energyLevel + ", the animal has died from exhaustion.");
		}
		return energyLevel;
	}
}

package com.omar;

public class Mammal {
	public int energyLevel;

    // Default constructor
    public Mammal() {
        this.energyLevel = 100; // Default energy level
    }
    
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.printf("Energy Level: %d \n", energyLevel);
		return energyLevel;
	}
}

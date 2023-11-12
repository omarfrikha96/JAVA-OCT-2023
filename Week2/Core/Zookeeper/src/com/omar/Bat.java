package com.omar;

public class Bat extends Mammal {
	public Bat() {
		super(300);
	}
	public void fly() {
		System.out.println("the sound of a bat taking off");
		energyLevel -= 50;
		displayEnergy();
	}
	public void eatHumans() {
		System.out.println("the so- well, never mind");
		energyLevel += 25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("the sound of a town on fire");
		energyLevel -= 100;
		displayEnergy();
	}
}

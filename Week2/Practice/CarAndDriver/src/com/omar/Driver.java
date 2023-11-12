package com.omar;

public class Driver extends Car {
	public void drive() {
		System.out.println("Driving...");
		gas--;
		status();
	}

	public void booster() {
		System.out.println("Boosting...");
		if (gas < 3) {
			System.out.println("Not enough gas!");
		} else {
			gas -= 3;
		}
		status();
	}

	public void refuel() {
		System.out.println("Refueling...");
		if (gas > 8) {
			System.out.println("Gas tank is full!");
		} else {
			gas += 2;
		}
		status();
	}
}

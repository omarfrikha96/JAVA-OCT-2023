package com.omar;

public class TestDrive {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive();
		driver.drive();
		driver.drive();
		driver.drive();
		driver.booster();
		driver.refuel();
		driver.refuel();


		System.out.println("You drive the car. \n");
		System.out.println("Gas remaining: " + driver.gas + "/10 \n");
	}

}

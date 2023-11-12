package com.omar;

public class Car {
	public int gas = 10;

	public void status() {
		if (gas > 0) {
			System.out.println("Gas: " + gas);
		} else {
			System.out.println("Out of gas!");
		}
	}
}

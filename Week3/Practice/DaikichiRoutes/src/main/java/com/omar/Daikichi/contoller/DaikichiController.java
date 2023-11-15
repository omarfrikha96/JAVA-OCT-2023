package com.omar.Daikichi.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikich")
public class DaikichiController {
	@RequestMapping("")
	public String display() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String displayToday() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String displayTomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}

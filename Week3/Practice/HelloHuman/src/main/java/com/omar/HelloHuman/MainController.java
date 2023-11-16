package com.omar.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "last_name", required = false) String last_name) {
		if (name == null && last_name == null) {
			return "Hello Human";
		} else if (last_name == null) {
			return "Hello " + name;
		}
		return "Hello " + name + " " + last_name;
	}

	@RequestMapping("/time")
	public String repeat(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "times", required = false) String times) {
		int time = Integer.parseInt(times);
		if (name == null && times == null) {
			return "Hello Human";
		} else if (times == null) {
			return "Hello " + name;
		} else if (times != null && time > 0) {
			StringBuilder repeat = new StringBuilder();
			for (int i = 0; i < time; i++) {
				repeat.append("Hello ").append(name).append("<br>");
			}
			return repeat.toString();
		}return "Hello " + name;
	}
}

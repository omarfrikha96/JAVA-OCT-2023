package com.ProjectManager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.ProjectManager.models.LoginUser;
import com.ProjectManager.models.Project;
import com.ProjectManager.models.User;
import com.ProjectManager.services.ProjectService;
import com.ProjectManager.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class LoginController {
	// Add once service is implemented:
	 @Autowired
	 private UserService userService;
	 
	 @Autowired
	 private ProjectService projectService;

		@GetMapping("/")
		public String index(Model model) {
		    model.addAttribute("newUser", new User());
		    model.addAttribute("newLogin", new LoginUser());
		    return "index.jsp";
		}
		
		@PostMapping("/register")
		public String register(@Valid @ModelAttribute("newUser") User newUser, 
				BindingResult result, Model model, HttpSession session) {

		    User user = userService.register(newUser, result);
		     
		    if(result.hasErrors()) {
		        model.addAttribute("newLogin", new LoginUser());
		        return "index.jsp";
		    }
		    session.setAttribute("userId", user.getId());
		 
		    return "redirect:/dashboard";
		}
		
		@PostMapping("/login")
		public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
				BindingResult result, Model model, HttpSession session) {
		     
			User user = userService.login(newLogin, result);
		 
		    if(result.hasErrors() || user==null) {
		        model.addAttribute("newUser", new User());
		        return "index.jsp";
		    }
		     
		    session.setAttribute("userId", user.getId());
		 
		    return "redirect:/dashboard";
		}
		
		@GetMapping("/dashboard")
		public String dashboard(HttpSession session, Model model) {
		 
			if(session.getAttribute("userId") == null) {
				return "redirect:/logout";
			}
			Long userId = (Long) session.getAttribute("userId");
			User user = userService.findById(userId);
			
			model.addAttribute("user", user);
			model.addAttribute("unassignedProjects", projectService.getUnassignedProjects(user));
			model.addAttribute("assignedProjects", projectService.getAssignedProjects(user));
			 
			return "dashboard.jsp";
		}
		

		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.setAttribute("userId", null); 
		    return "redirect:/";
		}

}

package com.SaveTravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.SaveTravels.models.Expense;
import com.SaveTravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	ExpenseService expenseService;

	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
//	Display Route - Display all expenses 
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}

//	Action Route - Create a expense
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}

//	Display Route - Display Edit Form
	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "edit.jsp";
	}

// Action Route -- Edit a expense
	@PostMapping("/expenses/edit/{id}")
	public String update(@PathVariable("id") Long id, Model model, @Valid @ModelAttribute("expense") Expense expense,
			BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("expense", expenseService.findExpense(id));
			return "redirect:/edit/{id}";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
// Action Route -- display one expense
	@GetMapping("/expenses/{id}")
	public String showExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "show.jsp";
	}
	
// ACTION ROUTE -- DELET a expense
	@DeleteMapping("/expenses/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/expenses";
	}
}

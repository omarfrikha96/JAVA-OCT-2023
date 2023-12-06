package com.SaveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SaveTravels.models.Expense;
import com.SaveTravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	// Read all
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}

	// Create
	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	// Find By ID
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}

	// update
	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	// delete
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}

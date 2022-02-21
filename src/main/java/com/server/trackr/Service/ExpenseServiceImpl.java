package com.server.trackr.Service;

import com.server.trackr.Entities.Expense;
import com.server.trackr.Repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public String saveExpense(Expense expense) {
        expenseRepository.save(expense);
        return "Expense saved";
    }

    @Override
    public String deleteExpense(Expense expense) {
        expenseRepository.delete(expense);
        return "Expense deleted";
    }

    @Override
    public String updateExpense(Expense updatedExpense) {
        expenseRepository.save(updatedExpense);
        return "Expense updated";
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

}

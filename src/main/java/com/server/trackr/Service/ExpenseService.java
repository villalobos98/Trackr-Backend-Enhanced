package com.server.trackr.Service;


import com.server.trackr.Entities.Expense;

import java.util.List;

public interface ExpenseService {
    String saveExpense(Expense expense);

    String deleteExpense(Expense expense);

    String updateExpense(Expense updatedExpense);

    List<Expense> getAllExpenses();
}

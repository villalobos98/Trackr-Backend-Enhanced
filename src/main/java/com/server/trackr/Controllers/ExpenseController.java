package com.server.trackr.Controllers;

import com.server.trackr.Service.ExpenseService;
import com.server.trackr.Entities.Expense;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
@CrossOrigin(origins = "http://localhost:3000")
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseController {
    @Autowired
    ExpenseService service;

    // The entire expense object must be passed and the expenseID given in the front-end must match the one stored in DB
    @PostMapping("/create")
    public ResponseEntity<String> createExpense(@RequestBody Expense expense) {
        service.saveExpense(expense);
        return new ResponseEntity<>("Expense saved", HttpStatus.OK);
    }

    // The entire expense object must be passed and the expenseID must match the ID in the database
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteExpense(@RequestBody Expense expense) {
        service.deleteExpense(expense);
        return new ResponseEntity<>("Expense deleted", HttpStatus.OK);
    }

    //NOT TEST JUST YET
    @PutMapping("/update")
    public ResponseEntity<String> updateExpense(@RequestBody Expense expense) {
    //        service.updateExpense(expense)
        return new ResponseEntity<>("Expense deleted", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Expense>> getAllExpenses(){
        List<Expense> allExpenses = service.getAllExpenses();
        return new ResponseEntity<>(allExpenses, HttpStatus.OK);
    }

}

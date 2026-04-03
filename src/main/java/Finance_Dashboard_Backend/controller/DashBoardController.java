package Finance_Dashboard_Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Finance_Dashboard_Backend.entity.FinancialRecord;
import Finance_Dashboard_Backend.service.FinancialService;

@RestController
@RequestMapping("/dashboard")
public class DashBoardController {
	@Autowired
    private FinancialService service;

    @GetMapping("/summary")
    public String getSummary() {
        List<FinancialRecord> list = service.getAll();

        double income = 0;
        double expense = 0;

        for (FinancialRecord r : list) {
            if (r.getType().equalsIgnoreCase("INCOME")) {
                income += r.getAmount();
            } else {
                expense += r.getAmount();
            }
        }

        return "Income: " + income + " Expense: " + expense + " Balance: " + (income - expense);
    }
}

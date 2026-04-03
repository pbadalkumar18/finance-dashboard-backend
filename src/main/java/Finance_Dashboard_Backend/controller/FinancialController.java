package Finance_Dashboard_Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Finance_Dashboard_Backend.entity.FinancialRecord;
import Finance_Dashboard_Backend.service.FinancialService;

@RestController
@RequestMapping("/records")
public class FinancialController 
{
	@Autowired
    private FinancialService service;

	@PostMapping
    public FinancialRecord create(@RequestBody FinancialRecord record) {
        return service.save(record);
    }

    @GetMapping
    public List<FinancialRecord> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted";
    }

} 

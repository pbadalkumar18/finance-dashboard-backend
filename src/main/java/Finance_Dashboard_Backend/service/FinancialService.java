package Finance_Dashboard_Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Finance_Dashboard_Backend.entity.FinancialRecord;
import Finance_Dashboard_Backend.repository.FinancialRecordRepository;

@Service
public class FinancialService {
	@Autowired
    private FinancialRecordRepository repo;

    public FinancialRecord save(FinancialRecord record) {
        return repo.save(record);
    }

    public List<FinancialRecord> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

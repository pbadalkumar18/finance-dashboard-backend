package Finance_Dashboard_Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Finance_Dashboard_Backend.entity.FinancialRecord;

public interface FinancialRecordRepository extends JpaRepository<FinancialRecord,Long>{

}

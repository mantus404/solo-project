package lt.techin.budgetback.repository;

import lt.techin.budgetback.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}

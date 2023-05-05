package lt.techin.budgetback.service;

import lt.techin.budgetback.model.Income;
import lt.techin.budgetback.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class IncomeService {
    @Autowired
    IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository){
        this.incomeRepository = incomeRepository;
    }

    public List<Income> getIncomeAll() {
        return incomeRepository.findAll();
    }

    public Income getIncomeById(Long id) {
        return incomeRepository.findById(id).orElseThrow();
    }
    public Income addIncome(Income income) {
        return incomeRepository.save(income);
    }
    public Income editIncome(Long id, Income income){
        Income incomeToSave = this.getIncomeById(id);
        incomeToSave.setTitle(income.getTitle());
        incomeToSave.setAmount(income.getAmount());
        incomeToSave.setDateValue(income.getDateValue());
        return incomeRepository.save(incomeToSave);
    }
    public void deleteIncome(Long id){
        incomeRepository.deleteById(id);
    }
}

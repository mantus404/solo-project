package lt.techin.budgetback.contoller;

import lt.techin.budgetback.dto.IncomeDto;
import lt.techin.budgetback.dto.mapper.IncomeMapper;
import lt.techin.budgetback.model.Income;
import lt.techin.budgetback.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/income")
public class IncomeController {
    @Autowired
    IncomeService incomeService;
    @GetMapping
    public List<Income> getIncomeAll(){
        return incomeService.getIncomeAll();
    }
    @GetMapping("/{id}")
    public Income getIncomeById(@PathVariable Long id) {
        return incomeService.getIncomeById(id);
    }
    @PostMapping("/{id}")
    public Income addIncome(@RequestBody IncomeDto incomeDto) {
        return incomeService.addIncome(IncomeMapper.toIncome(incomeDto));
    }
    @PatchMapping("/{id}")
    public Income editIncome(@PathVariable Long id, @RequestBody IncomeDto incomeDto){
        return incomeService.editIncome(id, IncomeMapper.toIncome(incomeDto));
    }
    @DeleteMapping("/{id}")
    public void deleteIncome(@PathVariable Long id){
        incomeService.deleteIncome(id);
    }
}

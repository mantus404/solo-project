package lt.techin.budgetback.dto.mapper;

import lt.techin.budgetback.dto.IncomeDto;
import lt.techin.budgetback.model.Income;

public class IncomeMapper {
    public static Income toIncome(IncomeDto incomeDto){
        Income income = new Income();
        income.setTitle(incomeDto.getTitle());
        income.setAmount(incomeDto.getAmount());
        income.setDateValue(incomeDto.getDateValue());
        return income;
    }
    public static IncomeDto toIncomeDto(Income income){
        IncomeDto incomeDto = new IncomeDto();
        incomeDto.setTitle(income.getTitle());
        incomeDto.setAmount(income.getAmount());
        incomeDto.setDateValue(income.getDateValue());
        return incomeDto;
    }
}

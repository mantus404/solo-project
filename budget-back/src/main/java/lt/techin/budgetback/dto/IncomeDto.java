package lt.techin.budgetback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeDto {
    @NotBlank
    private String title;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private Date dateValue;
}

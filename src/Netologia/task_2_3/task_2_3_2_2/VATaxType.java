package Netologia.task_2_3.task_2_3_2_2;

import java.math.BigDecimal;

public class VATaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(new BigDecimal(0.18));
    }
}
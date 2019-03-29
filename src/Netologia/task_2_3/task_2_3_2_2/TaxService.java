package Netologia.task_2_3.task_2_3_2_2;

import java.math.BigDecimal;

public class  TaxService {

    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}
package Netologia.task_2_3.task_2_3_2_2;

import java.math.BigDecimal;

public class ProgressiveTaxType  extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(100000)) == 1) {
            return amount.multiply( new BigDecimal(0.15));
        } else {
            return amount.multiply(new BigDecimal(0.10));
        }

//        switch (amount.max(new BigDecimal(100_000))){
//            case :
//                return amount.multiply(new BigDecimal(0.10));
//                break;
//                case
//        }

    }
}

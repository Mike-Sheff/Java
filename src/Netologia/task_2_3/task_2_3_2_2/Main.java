package Netologia.task_2_3.task_2_3_2_2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача: Задача от бухгалтеров. (BigDecimal)");
        System.out.println("");

        TaxService taxService = new TaxService();
        List<Bill> payments = Arrays.<Bill>asList( new Bill(new BigDecimal(10_015), new VATaxType(), taxService)
                ,new Bill(new BigDecimal(10_345.49), new IncomeTaxType(), taxService)
                ,new Bill(new BigDecimal(10_096.06), new ProgressiveTaxType(), taxService)
                ,new Bill(new BigDecimal(110_780.09), new ProgressiveTaxType(), taxService));

        for (int i = 0; i < payments.size(); ++i) {
            Bill bill = payments.get(i);
            bill.payTaxes();
        }

        System.out.println("");
        System.out.println("До свидания!");
    }
}

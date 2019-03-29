package Netologia.task_2_3.task_2_3_2;

import java.math.BigDecimal;

public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // вместо 0.0 посчитать размер налога исходя из TaxType
        //double taxAmount = 0.0;
        double taxAmount = this.taxType.calculateTaxFor(this.amount);
        taxService.payOut(taxAmount);
    }
}

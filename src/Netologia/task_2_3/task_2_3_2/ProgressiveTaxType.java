package Netologia.task_2_3.task_2_3_2;

public class ProgressiveTaxType  extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        if (amount > 100_000) {
            return amount * 0.15;
        } else {
            return amount * 0.10;
        }
    }
}
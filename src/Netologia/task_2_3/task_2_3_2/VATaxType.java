package Netologia.task_2_3.task_2_3_2;

public class VATaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}
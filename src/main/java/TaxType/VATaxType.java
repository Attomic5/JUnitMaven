package TaxType;

public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double taxAmount = amount * 18/100;
        return taxAmount;
    }
}

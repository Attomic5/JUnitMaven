package TaxType;

public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double taxAmount = amount * 13/100;
        return taxAmount;
    }
}

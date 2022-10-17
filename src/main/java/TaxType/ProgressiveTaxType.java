package TaxType;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        double taxAmount = 0;
        if(amount < 100000) {
            taxAmount = amount * 10/100;
        } else if (amount >= 100000) {
            taxAmount = amount * 15/100;
        }
        return taxAmount;
    }
}

import TaxType.IncomeTaxType;
import TaxType.VATaxType;
import TaxType.ProgressiveTaxType;


public class Main {
    public static void main(String[] args) {
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(155000.34, new IncomeTaxType(), new TaxService()),
                new Bill(756457.65, new VATaxType(), new TaxService()),
                new Bill(180000.74, new ProgressiveTaxType(), new TaxService()),
                new Bill(57000.94, new ProgressiveTaxType(), new TaxService()),
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}

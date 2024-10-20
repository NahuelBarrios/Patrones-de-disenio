package patternsdesign.creational.abstractfactory;

import static patternsdesign.Util.DEBIT_CARD;

public class Debit implements PaymentMethod{
    @Override
    public String doPayment() {
        return DEBIT_CARD;
    }
}

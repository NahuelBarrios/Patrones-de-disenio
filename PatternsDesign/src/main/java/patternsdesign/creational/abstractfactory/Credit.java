package patternsdesign.creational.abstractfactory;

import static patternsdesign.Util.CREDIT_CARD;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return CREDIT_CARD;
    }
}

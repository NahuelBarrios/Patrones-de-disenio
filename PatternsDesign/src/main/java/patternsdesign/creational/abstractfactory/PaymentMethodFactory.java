package patternsdesign.creational.abstractfactory;

import static patternsdesign.Util.CREDIT_CARD;
import static patternsdesign.Util.DEBIT_CARD;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod>{
    @Override
    public PaymentMethod create(String type) {
        if(DEBIT_CARD.equals(type))
            return new Debit();
        else if (CREDIT_CARD.equals(type))
            return new Credit();

        return null;
    }
}

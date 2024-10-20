package patternsdesign.creational.abstractfactory;

import static patternsdesign.Util.CARD;
import static patternsdesign.Util.PAYMENT_METHOD;

public class FactoryProvider {
    private FactoryProvider(){}
    public static AbstractFactory getFactory(String chooseFactory){
        if(CARD.equals(chooseFactory))
            return new CardFactory();
        else if (PAYMENT_METHOD.equals(chooseFactory))
            return new PaymentMethodFactory();

        return null;
    }
}

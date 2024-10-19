package patternsdesign.creational.abstractfactory;

public class FactoryProvider {
    private static final String CARD = "Card";
    private static final String PAYMENT_METHOD = "PaymentMethod";

    private FactoryProvider(){}
    public static AbstractFactory getFactory(String chooseFactory){
        if(CARD.equals(chooseFactory))
            return new CardFactory();
        else if (PAYMENT_METHOD.equals(chooseFactory))
            return new PaymentMethodFactory();

        return null;
    }
}

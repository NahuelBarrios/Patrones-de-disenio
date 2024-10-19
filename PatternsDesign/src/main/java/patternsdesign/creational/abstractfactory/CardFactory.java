package patternsdesign.creational.abstractfactory;

public class CardFactory implements AbstractFactory<Card>{
    private static final String VISA = "VISA";
    private static final String MASTERCARD = "MASTERCARD";

    @Override
    public Card create(String type) {
        if(VISA.equals(type))
            return new Visa();
        else if (MASTERCARD.equals(type))
            return new MasterCard();

        return null;
    }
}

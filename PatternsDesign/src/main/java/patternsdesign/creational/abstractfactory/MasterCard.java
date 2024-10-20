package patternsdesign.creational.abstractfactory;

import static patternsdesign.Util.CARD_NUMBER;
import static patternsdesign.Util.MASTERCARD;

public class MasterCard implements Card{

    @Override
    public String getCardType() {
        return MASTERCARD;
    }

    @Override
    public String getCardNumber() {
        return CARD_NUMBER;
    }
}

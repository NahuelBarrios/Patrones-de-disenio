package patternsdesign.creational.abstractfactory;

import static patternsdesign.Util.CARD_NUMBER;
import static patternsdesign.Util.VISA;

public class Visa implements Card{
    @Override
    public String getCardType() {
        return VISA;
    }

    @Override
    public String getCardNumber() {
        return CARD_NUMBER;
    }
}

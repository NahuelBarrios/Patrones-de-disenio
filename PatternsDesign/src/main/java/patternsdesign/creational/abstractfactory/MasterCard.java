package patternsdesign.creational.abstractfactory;

public class MasterCard implements Card{

    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "0004 0003 0002 0001";
    }
}

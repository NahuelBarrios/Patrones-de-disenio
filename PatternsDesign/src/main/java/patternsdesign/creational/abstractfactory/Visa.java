package patternsdesign.creational.abstractfactory;

public class Visa implements Card{
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0001 0002 0003 0004";
    }
}

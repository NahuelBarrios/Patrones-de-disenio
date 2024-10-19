package patternsdesign.creational.abstractfactory;

public class Debit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "DebitCard";
    }
}

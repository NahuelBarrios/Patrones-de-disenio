package patternsdesign.creational.abstractfactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod>{

    private static final String DEBIT = "DebitCard";
    private static final String CREDIT = "CreditCard";
    @Override
    public PaymentMethod create(String type) {
        if(DEBIT.equals(type))
            return new Debit();
        else if (CREDIT.equals(type))
            return new Credit();

        return null;
    }
}

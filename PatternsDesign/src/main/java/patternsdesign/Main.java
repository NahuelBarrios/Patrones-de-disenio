package patternsdesign;

import patternsdesign.creational.abstractfactory.AbstractFactory;
import patternsdesign.creational.abstractfactory.Card;
import patternsdesign.creational.abstractfactory.FactoryProvider;
import patternsdesign.creational.abstractfactory.PaymentMethod;
import patternsdesign.creational.factorymethod.Payment;
import patternsdesign.creational.factorymethod.PaymentFactory;
import patternsdesign.creational.factorymethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        probarFactoryMethod();
        probarAbstractFactoryMethod();
    }

    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        System.out.println("Metodo de pago: " + payment.doPayment());
    }

    private static void probarAbstractFactoryMethod(){
        AbstractFactory abstractFactoryCard = FactoryProvider.getFactory("Card");
        Card card = (Card) abstractFactoryCard.create("VISA");

        AbstractFactory abstractFactoryPaymentMethod = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactoryPaymentMethod.create("DebitCard");

        System.out.println("Card de tipo: " + card.getCardType() + ", con el tipo de pago: " + paymentMethod.doPayment());
    }

}
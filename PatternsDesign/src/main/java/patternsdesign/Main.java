package patternsdesign;

import patternsdesign.creational.abstractfactory.AbstractFactory;
import patternsdesign.creational.abstractfactory.Card;
import patternsdesign.creational.abstractfactory.FactoryProvider;
import patternsdesign.creational.abstractfactory.PaymentMethod;
import patternsdesign.creational.builder.CardUser;
import patternsdesign.creational.factorymethod.Payment;
import patternsdesign.creational.factorymethod.PaymentFactory;
import patternsdesign.creational.factorymethod.TypePayment;
import patternsdesign.creational.prototype.AmericanExpressPrototype;
import patternsdesign.creational.prototype.PrototypeCard;
import patternsdesign.creational.prototype.PrototypeFactory;

import static patternsdesign.Util.AMEX;
import static patternsdesign.Util.CARD;
import static patternsdesign.Util.VISA;
import static patternsdesign.Util.PAYMENT_METHOD;
import static patternsdesign.Util.DEBIT_CARD;
import static patternsdesign.Util.CARD_NUMBER;

public class Main {
    public static void main(String[] args) {
        probarFactoryMethod();
        probarAbstractFactoryMethod();
        probarBuilder();
        probarPrototype();
    }

    private static void probarFactoryMethod() {
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        System.out.println("Metodo de pago: " + payment.doPayment());
    }

    private static void probarAbstractFactoryMethod() {
        AbstractFactory abstractFactoryCard = FactoryProvider.getFactory(CARD);
        Card card = (Card) abstractFactoryCard.create(VISA);

        AbstractFactory abstractFactoryPaymentMethod = FactoryProvider.getFactory(PAYMENT_METHOD);
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactoryPaymentMethod.create(DEBIT_CARD);

        System.out.println("Card de tipo: " + card.getCardType() + ", con el tipo de pago: " + paymentMethod.doPayment());
    }

    private static void probarBuilder() {
        CardUser card = new CardUser.CardBuilder(VISA, CARD_NUMBER)
                .credit(true)
                .name("Walter Nahuel Barrios")
                .expires(2030)
                .build();
        System.out.println(card.toString());
    }

    private static void probarPrototype() {
        //Es mucho mas eficiente clonar un objeto a crearlo.
        PrototypeFactory.loadCard();

        try {
            PrototypeCard americanExpressPrototype = PrototypeFactory.getInstance(AMEX);
            americanExpressPrototype.getCard();

            PrototypeCard visaPrototype = PrototypeFactory.getInstance(VISA);
            visaPrototype.getCard();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
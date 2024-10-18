package PatternsDesign;

import PatternsDesign.creational.factorymethod.Payment;
import PatternsDesign.creational.factorymethod.PaymentFactory;
import PatternsDesign.creational.factorymethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();


        System.out.println("Hello world!");
    }
}
package patternsdesign.creational.factorymethod;

public class CardPayment implements Payment{

    @Override
    public String doPayment() {
        return "Pagando con Tarjeta de credito";
    }
}

package PatternsDesign.creational.factorymethod;

public class PaymentFactory {
/*
Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos
en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán como por ej:.
 */

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY -> {
                return new GooglePayment();
            }
            case CARD -> {
                return new CardPayment();
            }
            default -> {
                return null;
            }
        }
    }

}

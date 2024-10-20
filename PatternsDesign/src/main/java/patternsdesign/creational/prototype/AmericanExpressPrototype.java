package patternsdesign.creational.prototype;

public class AmericanExpressPrototype implements PrototypeCard{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("Obteniendo tarjeta American Express.");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta American Express.");
        return (AmericanExpressPrototype) super.clone();
    }
}

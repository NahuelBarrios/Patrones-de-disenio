package patternsdesign.creational.prototype;

public class VisaPrototype implements PrototypeCard{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("Obteniendo la tarjeta Visa.");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando la tarjeta Visa.");
        return (VisaPrototype) super.clone();
    }
}

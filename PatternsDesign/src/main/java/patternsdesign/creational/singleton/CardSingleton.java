package patternsdesign.creational.singleton;

public class CardSingleton {
    private static CardSingleton instance;
    private String name;

    private CardSingleton(){}

    public static synchronized CardSingleton getInstance(){ // con synchronized nos evitmoas que si 2 hilos entran al mismo tiempo, haya error
        if(instance == null){
            instance = new CardSingleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

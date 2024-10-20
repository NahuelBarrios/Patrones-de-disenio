package patternsdesign.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static patternsdesign.Util.AMEX;
import static patternsdesign.Util.VISA;

public class PrototypeFactory {
    private PrototypeFactory(){}
    private static final Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException {
        return prototypes.get(type).clone();
    }

    public static void loadCard(){
        VisaPrototype visaPrototype = new VisaPrototype();
        visaPrototype.setName(VISA);
        prototypes.put(VISA,visaPrototype);

        AmericanExpressPrototype americanExpressPrototype = new AmericanExpressPrototype();
        americanExpressPrototype.setName(AMEX);
        prototypes.put(AMEX,americanExpressPrototype);
    }
}

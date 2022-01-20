package ch4_factory_pattern;

public class SimplePizzaFactory {
    public Pizza createPizza (String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("cheese".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("cheese".equals(type)) {
            pizza = new ClamPizza();
        } else {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

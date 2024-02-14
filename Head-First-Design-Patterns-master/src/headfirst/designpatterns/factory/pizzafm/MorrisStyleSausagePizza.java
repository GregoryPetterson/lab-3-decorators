package headfirst.designpatterns.factory.pizzafm;

public class MorrisStyleSausagePizza extends Pizza {
    public MorrisStyleSausagePizza() {
        name = "Morris Style Sausage Pizza";
        dough = "Normal Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Sausage");
        toppings.add("Parmesian");
    }
}

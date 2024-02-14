package headfirst.designpatterns.factory.pizzafm;

public class MorrisStyleHashbrownPizza extends Pizza {
    public MorrisStyleHashbrownPizza() {
        name = "Morris Style Hashbrown Pizza";
        dough = "Normal Crust Dough";
        sauce = "Gravy";

        toppings.add("Sausage");
        toppings.add("Scrabled Eggs");
        toppings.add("Hashbrowns");
    }
}

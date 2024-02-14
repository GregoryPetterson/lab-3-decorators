package headfirst.designpatterns.factory.pizzafm;

public class MorrisPizzaStore extends PizzaStore{

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new MorrisStyleCheesePizza();
        } else if (item.equals("sausage")) {
            return new MorrisStyleSausagePizza();
        } else if (item.equals("hashbrown")) {
            return new MorrisStyleHashbrownPizza();
        }
        else return null;
    }
    
}

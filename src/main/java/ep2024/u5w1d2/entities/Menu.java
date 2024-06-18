package ep2024.u5w1d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void printMenu() {
        System.out.println(System.lineSeparator() + "---------------------------------------------MENU---------------------------------------------");
        System.out.println("------------------PIZZAS----------------------------------------------------------------------");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println(System.lineSeparator() + "------------------TOPPINGS----------------------------------------------------------------------");
        for (Topping topping : toppings) {
            System.out.println(topping);
        }
        System.out.println(System.lineSeparator() + "------------------DRINKS----------------------------------------------------------------------");
        for (Drink drink : drinks) {
            System.out.println(drink);
        }
    }
}

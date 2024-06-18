package ep2024.u5w1d2;

import ep2024.u5w1d2.entities.Drink;
import ep2024.u5w1d2.entities.Menu;
import ep2024.u5w1d2.entities.Pizza;
import ep2024.u5w1d2.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        Pizza margherita = (Pizza) context.getBean("getMargherita");
        Pizza hawaiian = (Pizza) context.getBean("getHawaiian");
        Pizza salami = (Pizza) context.getBean("getSalami");
        Pizza pepperoni = (Pizza) context.getBean("getPepperoni");
        Pizza vegetarian = (Pizza) context.getBean("getVegetarian");
        Pizza fourCheese = (Pizza) context.getBean("getFourCheese");
        Topping ham = (Topping) context.getBean("getHam");
        Topping pineapple = (Topping) context.getBean("getPineapple");
        Topping salamiTopping = (Topping) context.getBean("getSalamiTopping");
        Topping onion = (Topping) context.getBean("getOnions");
        Topping mozzarella = (Topping) context.getBean("getMozzarella");
        Drink water = (Drink) context.getBean("getWater");
        Drink cola = (Drink) context.getBean("getCola");
        Drink lemonade = (Drink) context.getBean("getLemonade");
        Drink wine = (Drink) context.getBean("getWine");
        Menu menu = (Menu) context.getBean("getMenu");

        menu.addPizza(margherita);
        menu.addPizza(hawaiian);
        menu.addPizza(salami);
        menu.addPizza(pepperoni);
        menu.addPizza(vegetarian);
        menu.addPizza(fourCheese);
        menu.addTopping(mozzarella);
        menu.addTopping(ham);
        menu.addTopping(salamiTopping);
        menu.addTopping(onion);
        menu.addTopping(pineapple);
        menu.addDrink(water);
        menu.addDrink(cola);
        menu.addDrink(lemonade);
        menu.addDrink(wine);


        menu.printMenu();

        context.close();
    }

}

package ep2024.u5w1d2.entities;

import ep2024.u5w1d2.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Order {
    private int number;
    private OrderStatus status;
    private int coverCharge;
    private LocalDate time;
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;
    private double total;

    public Order(int number, OrderStatus status, int coverCharge) {
        this.number = number;
        this.status = status;
        this.coverCharge = coverCharge;
    }
}



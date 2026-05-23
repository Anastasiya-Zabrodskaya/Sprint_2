import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args){
        Meat meat = new Meat (5, 100);
        Apple redApple = new Apple (10,50, "red");
        Apple greenApple = new Apple (8, 60, "green");

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        // Общая сумма без скидки
        double totalWithoutDiscount = cart.getTotalPriceWithoutDiscount();
        System.out.println("Общая сумма товаров без скидки: " + totalWithoutDiscount + " руб.");

        // Общая сумма со скидкой
        double totalWithDiscount = cart.getTotalPriceWithDiscount();
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount + " руб.");

        // Сумма вегетарианских товаров без скидки
        double vegetarianTotal = cart.getTotalPriceVegetarianWithoutDiscount();
        System.out.println("Общая сумма вегетарианских товаров без скидки: " + vegetarianTotal + " руб.");
    }
    }


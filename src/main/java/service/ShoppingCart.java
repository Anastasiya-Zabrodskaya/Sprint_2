package service;
import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }
        public double getTotalPriceWithoutDiscount() {
            double sum = 0.0;
            for (int i = 0; i < items.length; i++) {
                Food item = items[i];
                sum = sum + item.getAmount() * item.getPrice();
            }
            return sum;
            }
            public double getTotalPriceWithDiscount(){
        double sum = 0.0;
    for (int i = 0; i < items.length; i++) {
        Food item = items[i];
        double itemPrice = item.getAmount() * item.getPrice();
        double discountPercent = item.getDiscount();

        itemPrice = itemPrice * (1 - discountPercent / 100.0);
        sum = sum + itemPrice;
    }
return sum;
    }
    public double getTotalPriceVegetarianWithoutDiscount() {
        double sum = 0.0;


        for (int i = 0; i < items.length; i++) {
            Food item = items[i];

            if (item.isVegetarian()) {
                sum = sum + item.getAmount() * item.getPrice();
            }
        }

        return sum;
    }
}

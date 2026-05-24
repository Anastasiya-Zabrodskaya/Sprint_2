package model;
import model.constants.Colour;
import model.constants.Discount;
public class Apple extends Food {
    private String colour;
    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

        @Override
        public double getDiscount() {
        if(this.colour.equals(Colour.RED)){
            return Discount.RED_APPLE;
    }
else{
    return Discount.DEFAULT;
        }
    }
}

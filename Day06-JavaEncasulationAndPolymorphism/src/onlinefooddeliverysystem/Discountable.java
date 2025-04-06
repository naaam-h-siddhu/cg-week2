package onlinefooddeliverysystem;

public interface Discountable {
    String getDiscountDetails();

    double applyDiscount(double discountPercentage);
}

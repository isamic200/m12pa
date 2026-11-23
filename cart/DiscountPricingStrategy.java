package cart;

import product.Product;
import java.util.List;

public class DiscountPricingStrategy implements PricingStrategy {
    private final double discountRate;

    public DiscountPricingStrategy(double discountRate) {
        this.discountRate = discountRate;
    }

    public double calculateTotal(List<Product> products) {
        double total = products.stream()
                               .mapToDouble(Product::getPrice)
                               .sum();

        return total - (total * discountRate);
    }
}
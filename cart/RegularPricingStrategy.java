package cart;

import product.Product;
import java.util.List;

public class RegularPricingStrategy implements PricingStrategy {

    public double calculateTotal(List<Product> products) {
        return products.stream()
                       .mapToDouble(Product::getPrice)
                       .sum();
    }
}
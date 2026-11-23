package cart;

import product.Product;
import java.util.List;

public interface PricingStrategy {
    double calculateTotal(List<Product> products);
}
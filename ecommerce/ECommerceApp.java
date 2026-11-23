//Isaiah Clark
//cop3330c
//11/22/2026
package ecommerce;

import product.Product;
import cart.ShoppingCart;
import cart.RegularPricingStrategy;
import cart.DiscountPricingStrategy;
import cart.BulkDiscountPricingStrategy;

public class ECommerceApp {

    public static void main(String[] args) {

        final double STANDARD_DISCOUNT = 0.1;
        final int BULK_MINIMUM_QTY = 5;
        final double BULK_DISCOUNT = 0.2;

        ShoppingCart regularCart =
            new ShoppingCart(new RegularPricingStrategy());

        ShoppingCart discountCart =
            new ShoppingCart(
                new DiscountPricingStrategy(STANDARD_DISCOUNT));

        ShoppingCart bulkDiscountCart =
            new ShoppingCart(
                new BulkDiscountPricingStrategy(
                    BULK_MINIMUM_QTY, BULK_DISCOUNT));

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Mouse", 29.99);
        Product product3 = new Product("Keyboard", 79.99);
        Product product4 = new Product("Monitor", 249.99);
        Product product5 = new Product("Headphones", 89.99);

        Product[] products = {
            product1, product2, product3, product4, product5
        };

        for (Product product : products) {
            regularCart.addProduct(product);
            discountCart.addProduct(product);
            bulkDiscountCart.addProduct(product);
        }

        System.out.println("Regular Pricing:");
        regularCart.displayCart();

        System.out.println("\nDiscount Pricing:");
        discountCart.displayCart();

        System.out.println("\nBulk Discount Pricing:");
        bulkDiscountCart.displayCart();
    }
}
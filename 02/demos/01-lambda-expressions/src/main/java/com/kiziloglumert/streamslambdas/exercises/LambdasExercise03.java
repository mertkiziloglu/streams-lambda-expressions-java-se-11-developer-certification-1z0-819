
package com.kiziloglumert.streamslambdas.exercises;

import com.kiziloglumert.streamslambdas.ExampleData;
import com.kiziloglumert.streamslambdas.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdasExercise03 {

    public interface ShoppingCartFactory {
        ShoppingCart newShoppingCart();
    }

    /**
     * Exercise 3a: Implement interface ShoppingCartFactory using a method reference.
     *
     * @return A new ShoppingCartFactory.
     */
    public ShoppingCartFactory getShoppingCartFactory() {
        // TODO: Implement interface ShoppingCartFactory by using a method reference
        // Note: Don't implement ShoppingCartFactory with an anonymous class
        return null; // Replace 'null' by your solution
    }

    public static class ShoppingCart {
        private final List<Product> products = new ArrayList<>();

        public void add(Product product) {
            this.products.add(product);
        }


        /**
         * Exercise 3b: Calculate the total amount of the items in the shopping cart.
         *
         * @return The total amount of the items in the shopping cart.
         */
        public BigDecimal getTotalAmount() {
            BigDecimal total = BigDecimal.ZERO;

            // TODO: This solution does not work. Can you explain why?
//           products.forEach(product -> total.add(product.getPrice()));
            BigDecimal finalTotal = total;
            products.forEach(product -> finalTotal.add(product.getPrice()));

// TODO: Implement this method in whatever way you like (you don't have to use
// lambda expressions)

            for (Product product : products) {
                total = total.add(product.getPrice());   //ic parantez map get price yapiyor dis taraf ise totale eklior
            }
            //more sophistice
            total = products.stream()
                    .map(Product::getPrice)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            return total;
        }
        // TODO: Implement this method in whatever way you like (you don't have to use lambda expressions)



    }
}

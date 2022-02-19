package com.kiziloglumert.streamslambdas.exercises;

import com.kiziloglumert.streamslambdas.Category;
import com.kiziloglumert.streamslambdas.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static final Product PENCILS = new Product(Category.OFFICE, "Pencils", new BigDecimal("5.79"));
    public static final Product APPLES = new Product(Category.FOOD, "Apples", new BigDecimal("1.29"));
    public static final Product PLATES = new Product(Category.UTENSILS, "Plates", new BigDecimal("12.95"));
    public static final Product SPAGHETTI = new Product(Category.FOOD, "Spaghetti", new BigDecimal("2.79"));
    public static final Product COFFEE = new Product(Category.FOOD, "Coffee", new BigDecimal("7.49"));
    public static final Product DETERGENT = new Product(Category.CLEANING, "Detergent", new BigDecimal("3.79"));

    private static final List<Product> PRODUCTS = List.of(PENCILS, APPLES, PLATES, SPAGHETTI, COFFEE, DETERGENT);

    public static List<Product> getProducts() {
        return new ArrayList<>(PRODUCTS);
    }
}

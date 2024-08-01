package org.example.model;

public class Store {
    public static void main(String[] args) {
        Chocolate a = new Chocolate("Snack", 35.75, "chocolate","Milk" );
        Coke b = new Coke("beverages", 20.5, "coke", 0);
        Bread c = new Bread("bakery", 7.0, "bread", "soft");

        ProductForSale[] objects = {a,b,c};

        listProducts(objects);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products){
            product.showDetails();
        }
    }
}
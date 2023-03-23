/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: Product class creates an item that is sold at a store and has a set price and
 */
package U9.U9Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductDriver {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("Sephora", 20, false, "Sky High Mascara");
        Product food1 = new Food("Wingstop", 9, true, "Medium", "BBQ Chicken");
        Product shoe1 = new Shoes("Dick Ponds", 130, false, "Mens", "Running", "Black", true, 9.5, "Nike Pegasus 29");
        Product apparel1 = new Apparel("Claire's", 15, true, "Womens", "Formal", "Gold", "Hoop Earrings");
        Product clothing1 = new Clothing("Mens", "Running", "Red", "T-Shirt");
        Product product2 = new Product("Lush", 11, false, "Scrubee Body Scrub");
        Product food2 = new Food("Starbucks", 6, false, "Large", "Pistachio Cold Brew");
        Product shoe2 = new Shoes("Nike", 110, true, "Womens", "Sportstyle", "White", true, 7.5, "Air Force One");
        Product apparel2 = new Apparel("Fossil", 160, true, "Womens", "Formal", "Gold", "Wristwatch");
        Product clothing2 = new Clothing("Lululemon", 79, "Womens", "Running", "Black", "T-Shirt", "Swiftly Tech");
        Product product3 = new Product("Dicks", 29, "Hydro Flask");
        Product food3 = new Food("Dunkin Donuts", 2, true, "Medium", "Hot Chocolate");
        Product fillerShoes = new Shoes();
        Product fillerClothing = new Clothing();


        System.out.println("Welcome to the mall!");
        System.out.println();

    }
}


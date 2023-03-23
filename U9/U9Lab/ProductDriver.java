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
        Food food1 = new Food("Wingstop", 9, true, "Medium", "BBQ Chicken");
        Shoes shoe1 = new Shoes("Dick Ponds", 130, false, "Mens", "Running", "Black",
                true, 9.5, "Nike Pegasus 29");
        Apparel apparel1 = new Apparel("Claire's", 15, true, "Womens", "Formal", "Gold",
                "Hoop Earrings");
        Clothing clothing1 = new Clothing("Mens", "Running", "Red", "T-Shirt");
        Product product2 = new Product("Lush", 11, false, "Scrubee Body Scrub");
        Food food2 = new Food("Starbucks", 6, false, "Large", "Pistachio Cold Brew");
        Shoes shoe2 = new Shoes("Nike", 110, true, "Womens", "Sportstyle", "White",
                true, 7.5, "Air Force One");
        Product apparel2 = new Apparel("Fossil", 160, true, "Womens", "Formal", "Gold",
                "Wristwatch");
        Clothing clothing2 = new Clothing("Lululemon", 79, "Womens", "Running", "Black",
                "T-Shirt", "Swiftly Tech");
        Product product3 = new Product("Dicks", 29, "Hydro Flask");
        Product food3 = new Food("Dunkin Donuts", 2, true, "Medium", "Hot Chocolate");
        Shoes fillerShoes = new Shoes();
        Clothing fillerClothing = new Clothing();

        products.add(product3);
        products.add(product2);
        products.add(product1);
        products.add(apparel1);
        products.add(apparel2);
        products.add(shoe1);
        products.add(shoe2);
        products.add(food1);
        products.add(food2);
        products.add(food3);
        products.add(clothing1);
        products.add(clothing2);

        for(Product curProduct : products){
            System.out.println(curProduct);
        }

        System.out.println("\n\n\n\n");


        //Create an outfit and calculate price
        ArrayList<Apparel> outfit = new ArrayList<>();
        outfit.add(clothing2);
        outfit.add(clothing1);
        outfit.add(shoe1);
        System.out.println("My outfit costs "+fillerClothing.calcOutfitPrice(outfit));

        boolean ifFormal = true;
        //Creating a random outfit!
        System.out.println(fillerShoes.randomShoes(ifFormal, "Mens"));
        System.out.println(fillerShoes.randomShoes(ifFormal, "Mens"));
        ifFormal = false;
        System.out.println(fillerClothing.randomTop(ifFormal, "Mens"));
        System.out.println(fillerClothing.randomBottom(ifFormal, "Mens"));


        //Checking how food and clothing mix!
        System.out.println("\nIs a red shirt okay for fast food?");
        System.out.println( food1.compatibleFoodWithClothing(clothing1));

        System.out.println("\nAre Nike shoes appropriate for formal food?");
        System.out.println(food2.isClothingAppropriate(shoe2));

        System.out.println();

        //Should I buy Nike or Lulu?
        System.out.println("Is the Nike T-Shirt or Lulu Swiftly Tech a better price?");
        clothing2.compareProductPrice(clothing1);
    }

}


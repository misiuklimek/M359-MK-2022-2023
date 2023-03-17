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
        Product product1 = new Product("Sephora",20,false,"Sky High Mascara");
        Product food1 = new Food("Wingstop",9,true,"Medium","BBQ Chicken");
        Product shoe1 = new Shoes("Dick Ponds",130,false,"Mens","Running","Black",true,9.5,"Nike Pegasus 29");
        Product apparel1 = new Apparel("Claire's",15,true,"Womens","Formal","Gold","Hoop Earrings");
        Product clothing1 = new Clothing("Mens","Running","Red","T-Shirt");
        Product product2 = new Product("Lush", 11,false,"Scrubee Body Scrub");
        Product food2 = new Food("Starbucks",6,false,"Large","Pistachio Cold Brew");
        Product shoe2 = new Shoes("Nike",110,true,"Womens","Sportstyle","White",true,7.5,"Air Force One");
        Product apparel2 = new Apparel("Fossil",160,true,"Womens","Formal","Gold","Wristwatch");


        System.out.println("Welcome to the mall!\nWhat are you looking for today?");

        Scanner in = new Scanner(System.in);
        boolean tryAgain = true;
        while(tryAgain){
            try{
                System.out.println("1. Food\n2. Apparel");
                int num = in.nextInt();
                in.nextLine();

                if(num == 1){
                    System.out.println("Looking for : Food\n");
                    // display array of available food objects

                } else if(num == 2){
                    System.out.println("Looking for : Apparel\nWhat type of apparel are you looking for?\n3.Clothing\n4. Shoes");
                    int num2 = in.nextInt();
                    if(num2 == 3){
                        System.out.println("Looking for : Clothing\n");
                        //display array of available clothing objects
                    } else if(num2 == 4){
                        System.out.println("Looking for : Shoes\n");
                        //display array of available shoe objects
                    }
                }

            } catch (Exception e){
                System.out.println("ERROR 404: Could not find search results. Please type in an available number option.");
                in.nextLine();
            }
        }
    }
    public static Product[] searchResult(){

    }
}

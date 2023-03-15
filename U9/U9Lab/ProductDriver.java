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

}

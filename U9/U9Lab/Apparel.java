/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: A child class of the Product class, an Apparel object has a gender, activity, and color attributes
 */
package U9.U9Lab;

import java.util.ArrayList;

public class Apparel extends Product{
    private String gender;
    private String activity;
    private String color;

    /**
     * Static method that uses Math.Random to create a random color
     * @return String of random color
     */
    public static String randomColor(){
        double random = Math.random();
        String color;
        if(random > .8){
            color = "White";
        } else if (random>.6) {
            color = "Black";
        } else if(random>.4){
            color = "Red";
        } else if(random>.2){
            color = "Blue";
        } else{
            color = "Brown";
        }
        return color;
    }


    //CONSTRUCTORS

    /**
     * Constructor that includes all attributes
     * @param vendor Name of apparel vendor (Super)
     * @param price Price of apparel (Super)
     * @param onSale Boolean if product is on sale (Super)
     * @param gender String of apparel gender
     * @param activity String of apparel activity designation
     * @param color String of apparel's color
     * @param productName String of the apparel's name (Super)
     */
    public Apparel(String vendor, int price, boolean onSale, String gender, String activity, String color, String productName) {
        super(vendor, price, onSale, productName);
        this.gender = gender;
        this.activity = activity;
        this.color = color;
    }
    /**
     * Constructor that includes all attributes except ifSale boolean
     * @param vendor Name of apparel vendor (Super)
     * @param price Price of apparel (Super)
     * @param gender String of apparel gender
     * @param activity String of apparel activity designation
     * @param color String of apparel's color
     * @param productName String of the apparel's name (Super)
     */
    public Apparel(String vendor, int price, String gender, String activity, String color, String productName) {
        super(vendor, price, productName);
        this.gender = gender;
        this.activity = activity;
        this.color = color;
    }
    /**
     * Constructor that includes Super's no value constructor.
     * @param gender String of apparel gender
     * @param activity String of apparel activity designation
     * @param color String of apparel's color
     */
    public Apparel(String gender, String activity, String color) {
        this.gender = gender;
        this.activity = activity;
        this.color = color;
    }

    /**
     * No inputted value constructor.
     */
    public Apparel(){
        this.gender = "None";
        this.activity = "None";
        this.color = "None";
    }

    /**
     * Compares the value and price of two different products to figure out which one to buy
     * @param two The second value the first one is compared to
     * @return An output of the better priced deal and the price of the better one.
     */
    public int compareProductPrice(Apparel two){
        if (this.getPrice()> two.getPrice()){
            System.out.println(this.getProductName()+"is a better deal!");
            return this.getPrice();
        } else if(this.getPrice()< two.getPrice()){
            System.out.println(two.getProductName()+"is a better deal!");
            return two.getPrice();
        } else{
            System.out.println(this.getProductName()+" and "+two.getProductName()+" are the same price!");
            return this.getPrice();
        }

    }

    /**
     * Checks if one apparel is equal to another apparel.
     * @param other Other piece of apparel
     * @return Boolean of if it is equal or not
     */
    public boolean ifEqual(Apparel other){
        if (gender.equals(other.gender) && activity.equals(other.activity) && color.equals(other.color)){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Checks which Apparel object has the better price
     * @param outfit The other outfit to be compared to
     * @return Object with better price
     */
    public int calcOutfitPrice(Apparel[] outfit){
        int price = 0;
        price += outfit[0].getPrice() + outfit[1].getPrice() + outfit[2].getPrice();
        return price;
    }

    /**
     * Creates a random outfit with a random top, random pants, and a random pair of shoes.
     * @return An array of three outfit pieces
     */
    public Apparel[] randomOutfit(){
        Apparel[] outfit = new Apparel[3];
        Apparel bottom =
        return outfit;
    }


    /**
     * Creates a string outfit of a piece of Apparel with all of its attributes.
     * @return String of apparel attributes
     */
    @Override
    public String toString(){
        String output = super.toString();
        output += "Gender: " + gender + "\nActivity: " + activity + "\nColor: " + color+"\n";
        return output;
    }

    //GETTERS AND SETTERS

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

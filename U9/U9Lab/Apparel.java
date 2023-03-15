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

    //CONSTRUCTORS
    public Apparel(String vendor, int price, boolean onSale, String gender, String activity, String color, String productName) {
        super(vendor, price, onSale, productName);
        this.gender = gender;
        this.activity = activity;
        this.color = color;
    }

    public Apparel(String vendor, int price, String gender, String activity, String color, String productName) {
        super(vendor, price, productName);
        this.gender = gender;
        this.activity = activity;
        this.color = color;
    }

    public Apparel(String gender, String activity, String color) {
        this.gender = gender;
        this.activity = activity;
        this.color = color;
    }

    public Apparel(){
        this.gender = "None";
        this.activity = "None";
        this.color = "None";
    }

    public int compareProductPrice(Apparel one, Apparel two){
        if (one.getPrice()> two.getPrice()){
            System.out.println(one.getProductName()+"is a better deal!");
            return one.getPrice();
        } else if(one.getPrice()< two.getPrice()){
            System.out.println(two.getProductName()+"is a better deal!");
            return two.getPrice();
        } else{
            System.out.println(one.getProductName()+" and "+two.getProductName()+" are the same price!");
            return one.getPrice();
        }

    }

    public boolean ifEqual(Apparel other){
        if (gender.equals(other.gender) && activity.equals(other.activity) && color.equals(other.color)){
            return true;
        } else{
            return false;
        }
    }

    public int calcOutfitPrice(Apparel[] outfit){
        int price = 0;
        price += outfit[0].getPrice() + outfit[1].getPrice() + outfit[2].getPrice();
        return price;
    }


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

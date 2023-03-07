package U9.U9Lab;

import java.util.ArrayList;

public class Apparel extends Product{
    private String gender;
    private String activity;
    private String color;

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

    public boolean ifEqual(Apparel other){
        if (gender.equals(other.gender) && activity.equals(other.activity) && color.equals(other.color)){
            return true;
        } else{
            return false;
        }
    }

    public int calcPrice(){
        
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

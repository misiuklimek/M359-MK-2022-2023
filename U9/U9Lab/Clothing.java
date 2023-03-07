/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: Product class creates an item that is sold at a store and has a set price and
 */
package U9.U9Lab;

public class Clothing extends Apparel{
    private String type;

    public Clothing(String vendor, int price, boolean onSale, String gender, String activity, String color, String type, String productName) {
        super(vendor, price, onSale, gender, activity, color, productName);
        this.type = type;
    }

    public Clothing(String vendor, int price, String gender, String activity, String color, String type, String productName) {
        super(vendor, price, gender, activity, color, productName);
        this.type = type;
    }

    public Clothing(String gender, String activity, String color, String type) {
        super(gender, activity, color);
        this.type = type;
    }

    public Clothing() {
        this.type = "None";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

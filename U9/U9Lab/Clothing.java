/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: A child of the Apparel class, grandchild of the Product class, a Clothing object has a type attribute
 */
package U9.U9Lab;

public class Clothing extends Apparel{
    private String type;

    //CONSTRUCTORS
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



    @Override
    public String toString(){
        String output = super.toString();
        output += "Type: "+type+"\n";
        return output;
    }

    //GETTERS AND SETTERS
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

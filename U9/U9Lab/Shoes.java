/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: A child of the Apparel class and grandchild of the Product class, a Shoe object doesn't/have laces, and has a size attribute
 */
package U9.U9Lab;

public class Shoes extends Apparel{
    private boolean hasLaces;
    private double shoeSize;

    //CONSTRUCTORS
    public Shoes(String vendor, int price, boolean onSale, String gender, String activity, String color, boolean hasLaces, double shoeSize, String productName) {
        super(vendor, price, onSale, gender, activity, color, productName);
        this.hasLaces = hasLaces;
        this.shoeSize = shoeSize;
    }

    public Shoes(String vendor, int price, String gender, String activity, String color, boolean hasLaces, double shoeSize, String productName) {
        super(vendor, price, gender, activity, color, productName);
        this.hasLaces = hasLaces;
        this.shoeSize = shoeSize;
    }

    public Shoes(String gender, String activity, String color, boolean hasLaces, double shoeSize) {
        super(gender, activity, color);
        this.hasLaces = hasLaces;
        this.shoeSize = shoeSize;
    }

    public Shoes() {
        this.hasLaces = false;
        this.shoeSize = -1;
    }

    @Override
    public String toString() {
        return super.toString()+ "Laces: " + hasLaces + "\nShoe Size: " + shoeSize+"\n";
    }

    //GETTERS AND SETTERS

    public boolean isHasLaces() {
        return hasLaces;
    }

    public void setHasLaces(boolean hasLaces) {
        this.hasLaces = hasLaces;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }
}

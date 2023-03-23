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


    public Shoes randomShoes(Boolean ifFormal, String gender){
        int randomBottomCost;
        String activity;

        String randomVendorClothing = "";
        if(ifFormal){
            double random1 = Math.random();
            if(random1>.8){
                randomVendorClothing = "Van Heusen";
            } else if (random1>.6) {
                randomVendorClothing = "Gucci";
            } else if (random1>.4) {
                randomVendorClothing = "H&M";
            } else if (random1>.2) {
                randomVendorClothing = "Armani";
            } else{
                randomVendorClothing = "Amazon";
            }
            randomBottomCost = (int)(Math.random() * 200)+50;
            activity = "Formal";

        } else{
            double random1 = Math.random();
            if(random1>.8){
                randomVendorClothing = "Nike";
            } else if (random1>.6) {
                randomVendorClothing = "Adidas";
            } else if (random1>.4) {
                randomVendorClothing = "Champion";
            } else if (random1>.2) {
                randomVendorClothing = "Patagonia";
            } else{
                randomVendorClothing = "Levis";
            }
            randomBottomCost = (int)(Math.random() * 100);
            activity = "Casual";

        }
        String productNameTop = randomVendorClothing +" Shirt";
        Clothing randomShoe = new Clothing(randomVendorClothing, randomBottomCost, gender, activity, randomColor(),"Pants", productNameTop);
        return randomShoe;
    }

    public Shoes() {
        this.hasLaces = false;
        this.shoeSize = -1;
    }
    /**
     * Formats Shoes object information to a String
     * @return Shoes object info
     */
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

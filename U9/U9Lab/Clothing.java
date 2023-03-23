/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: A child of the Apparel class, grandchild of the Product class, a Clothing object has a type attribute
 */
package U9.U9Lab;

public class Clothing extends Apparel{
    private String type;

    //CONSTRUCTORS

    /**
     * Constructor with all variables
     * @param vendor Name of apparel vendor (Super)
     * @param price Price of apparel (Super)
     * @param onSale Boolean if product is on sale (Super)
     * @param gender String of apparel gender
     * @param activity String of apparel activity designation
     * @param color String of apparel's color
     * @param productName String of the apparel's name (Super)
     * @param type String of the type of apparel piece it is.
     */
    public Clothing(String vendor, int price, boolean onSale, String gender, String activity, String color, String type, String productName) {
        super(vendor, price, onSale, gender, activity, color, productName);
        this.type = type;
    }

    /**
     * Constructor with all variables except if the object is on sale
     * @param vendor Name of apparel vendor (Super)
     * @param price Price of apparel (Super)
     * @param gender String of apparel gender
     * @param activity String of apparel activity designation
     * @param color String of apparel's color
     * @param productName String of the apparel's name (Super)
     * @param type String of the type of apparel piece it is.
     */
    public Clothing(String vendor, int price, String gender, String activity, String color, String type, String productName) {
        super(vendor, price, gender, activity, color, productName);
        this.type = type;
    }
    /**
     * Constructor with all variables except the clothing type and if it is on sale
     * @param vendor Name of apparel vendor (Super)
     * @param price Price of apparel (Super)
     * @param gender String of apparel gender
     * @param activity String of apparel activity designation
     * @param color String of apparel's color
     * @param productName String of the apparel's name (Super)
     */
    public Clothing(String vendor, int price, String gender, String activity, String color, String productName) {
        super(vendor, price, gender, activity, color, productName);
        this.type = "No specific type";
    }

    /**
     * Constructor for when super uses no clause constructor
     * @param gender String of gender
     * @param activity String of clothing use
     * @param color Color of clothing
     * @param type Type of clothing
     */
    public Clothing(String gender, String activity, String color, String type) {
        super(gender, activity, color);
        this.type = type;
    }

    /**
     * Creates a random top piece of apparel based on gender and the formality of the piece. Creates a random price,
     * color, and generates a name for the piece
     * @param ifFormal If the piece is meant to be formal or casual
     * @param gender The gender of the piece
     * @return A clothing object of the randomized piece
     */
    public Clothing randomTop(boolean ifFormal, String gender){
        int randomTopCost;
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
            randomTopCost = (int)(Math.random() * 200)+50;
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
            randomTopCost = (int)(Math.random() * 100);
            activity = "Casual";

        }
        String productNameTop = randomVendorClothing +" Shirt";
        Clothing randomTop = new Clothing(randomVendorClothing, randomTopCost, gender, activity, randomColor(), "Shirt", productNameTop);
        return randomTop;
    }

    /**
     * Creates a random bottom piece of apparel based on gender and the formality of the piece. Creates a random price,
     * color, and generates a name for the piece
     * @param ifFormal If the piece is meant to be formal or casual
     * @param gender The gender of the piece
     * @return A clothing object of the randomized piece
     */
    public Clothing randomBottom(boolean ifFormal, String gender){
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
        Clothing randomBottom = new Clothing(randomVendorClothing, randomBottomCost, gender, activity, randomColor(),"Pants", productNameTop);
        return randomBottom;
    }

    /**
     * Formats Clothing object information to a String
     * @return Clothing object info
     */
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

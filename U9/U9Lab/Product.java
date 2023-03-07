/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: Product class creates an item that is sold at a store and has a set price and
 */
package U9.U9Lab;

public class Product {
    private String vendor;
    private int price;
    private boolean onSale;
    private String productName;
    public static int numVendors;


    public Product(String vendor, int price, boolean onSale, String productName) {
        this.vendor = vendor;
        this.price = price;
        this.onSale = onSale;
        this.productName = productName;
        numVendors++;
    }

    public Product(String vendor, int price, String productName) {
        this.vendor = vendor;
        this.price = price;
        this.onSale = false;
        this.productName= productName;
        numVendors++;
    }

    public Product(){
        this.onSale = false;
        this.price = -1;
        this.vendor = "None";
        this.productName = "No name";
    }

    //GETTERS AND SETTERS

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }


    //METHODS

    public boolean ifEqual(Product other){
        if (vendor.equals(other.vendor) && price == other.price){
            return true;
        } else{
            return false;
        }
    }

    public void addSale(){
        onSale = true;
    }

    public String toString(){
        String output = "";
        output +=
    }

    public String mallInfo(){
        //  STATIC INT OF THE NUMBER OF STORES, int of products sold at the mall, prompt to search through which type of products
    }

    public Product[][] displayResults(){
        //user searches using filters for vendor, size, price, onSale, etc. and returns a Product[][] of search results
        // set number of 4 columns, rows differ by number of search results
    }

    //public int calcPrice(){
}

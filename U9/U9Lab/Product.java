/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: Product class creates an item that is sold by a vendor, has a price, is/n't on sale, and a static variable
keeping track of the number of vendors
 */
package U9.U9Lab;

import java.util.ArrayList;

public class Product {
    private String vendor;
    private int price;
    private boolean onSale;
    private String productName;
    public static int numVendors;

    public static ArrayList<String> vendors = new ArrayList<String>();
    public static ArrayList<String> products = new ArrayList<String>();

    //CONSTRUCTORS
    public Product(String vendor, int price, boolean onSale, String productName) {
        this.vendor = vendor;
        for (String store : vendors){
            if (!(store.equalsIgnoreCase(vendor))){
                vendors.add(vendor);
            }
        }
        this.price = price;
        this.onSale = onSale;
        this.productName = productName;
        for (String name : products){
            if (!(name.equalsIgnoreCase(productName))){
                products.add(productName);
            }
        }
        numVendors++;
    }

    public Product(String vendor, int price, String productName) {
        this.vendor = vendor;
        for (String store : vendors){
            if (!(store.equalsIgnoreCase(vendor))){
                vendors.add(vendor);
            }
        }
        this.price = price;
        this.onSale = false;
        this.productName= productName;
        for (String name : products){
            if (!(name.equalsIgnoreCase(productName))){
                products.add(productName);
            }
        }
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
//METHODS

    /**
     * Checks if two objects are sold by the same vendor
     * @param other The other product's vendor
     * @return true or false
     */
    public boolean ifEqual(Product other){
        if (vendor.equals(other.vendor) && price == other.price){
            return true;
        } else{
            return false;
        }
    }

    public void addSale(){
        onSale = true;
        price = price/2;
    }

    public String toString(){
        String output = "Product: "+productName+"\nVendor: "+vendor+"\nPrice: "+price;
        output += "\nIs it on sale? "+onSale+"\n";
        return output;
    }

    public String productSearch(){
        //  STATIC INT OF THE NUMBER OF STORES, int of products sold at the mall, prompt to search through which type of products

    }

    //public Product[][] displayResults(){
        //user searches using filters for vendor, size, price, onSale, etc. and returns a Product[][] of search results
        // set number of 4 columns, rows differ by number of search results

    //}

    //public int calcPrice(){
}

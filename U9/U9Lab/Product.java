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

    //CONSTRUCTORS

    /**
     * Constructor with all attributes
     * @param vendor String of vendor name
     * @param price Int of price
     * @param onSale Boolean on if on sale
     * @param productName String of name
     */
    public Product(String vendor, int price, boolean onSale, String productName) {
        this.vendor = vendor;
        this.price = price;
        this.onSale = onSale;
        this.productName = productName;
    }

    /**
     * Constructor with all attributes
     * @param vendor String of vendor name
     * @param price Int of price
     * @param productName String of name
     */
    public Product(String vendor, int price, String productName) {
        this.vendor = vendor;
        this.price = price;
        this.onSale = false;
        this.productName = productName;

    }

    /**
     * Constructor with no attributes
     */
    public Product() {
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
     *
     * @param other The other product's vendor
     * @return true or false
     */
    public boolean ifEqual(Product other) {
        if (vendor.equals(other.vendor) && price == other.price) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Alters an existing item by adding a 50% sale onto the price
     */
    public void addSale() {
        onSale = true;
        price = price / 2;
    }

    /**
     * Converts a product into a string with main variables
     *
     * @return String of product
     */
    public String toString() {
        String output = "Product: " + productName + "\nVendor: " + vendor + "\nPrice: " + price;
        output += "\nIs it on sale? " + onSale + "\n";
        return output;
    }

}

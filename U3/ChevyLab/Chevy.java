package U3.ChevyLab;

import java.util.PrimitiveIterator;

public class Chevy {



    //private variables
    private int year;
    private int miles;
    private double mpg;
    private double basePrice;
    private String model;
    private String color;
    private boolean luxuryPkg;
    private boolean FWDPkg;
    private boolean sportsPkg;
    private double priceWithUpgrades;
    private double grandTotal;

    private final String MAKE = "Chevrolet";
    private final double TAX_RATE = .122;
    private final double LUX_PKG_PRICE = basePrice * .2;
    private final int FOURWD_PKG_PRICE = 3500;
    private final double SPORTS_PKG_PRICE = basePrice * .15;
    private final double SPORTS_PKG_MPG = mpg * .2;




    // Constructors
    public Chevy() {
        this.year = 2021;
        this.miles = 0;
        this.mpg = 35;
        this.basePrice = 16000;
        this.model = "Trax";
        this.color = "White";
        this.luxuryPkg = false;
        this.FWDPkg = false;
        this.sportsPkg = false;
    }

    public Chevy(int year, int miles, double mpg, double basePrice, String model,
                 String color, boolean luxuryPkg, boolean FWDPkg, boolean sportsPkg) {
        this.year = year;
        this.miles = miles;
        this.mpg = mpg;
        this.basePrice = basePrice;
        this.model = model;
        this.color = color;
        this.luxuryPkg = luxuryPkg;
        this.FWDPkg = FWDPkg;
        this.sportsPkg = sportsPkg;
    }



    //methods

    public int compareTo(Chevy other)   {
        if (this.mpg > other.mpg){
            return -1;
        } else if(this.mpg < other.mpg){
            return 1;
        } else{
            return 0;
        }
    }

    

    public void calcPrice(){

    }




    //get/set methods
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMiles() {
        return miles;
    }
    public void setMiles(int miles) {
        this.miles = miles;
    }
    public double getMpg() {
        return mpg;
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getLuxuryPkg() {
        return luxuryPkg;
    }
    public void setLuxuryPkg(boolean luxuryPkg) {
        this.luxuryPkg = luxuryPkg;
    }
    public boolean get4WDPkg() {
        return FWDPkg;
    }
    public void set4WDPkg(boolean FWDPkg) {
        this.FWDPkg = FWDPkg;
    }
    public boolean getSportsPkg() {
        return sportsPkg;
    }
    public void setSportsPkg(boolean sportsPkg) {
        this.sportsPkg = sportsPkg;
    }
    public double getPriceWithUpgrades() {
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(double priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getMake() {
        return MAKE;
    }
}

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
    private final double TAX_RATE = 1.122;
    private final double LUX_PKG_PRIC = .2;
    private final int FOURWD_PKG_PRICE = 3500;
    private final double SPORTS_PKG_PRICE = .15;
    private final double SPORTS_PKG_MPG = .2;




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
        if (this.miles > other.miles){
            return -1;
        } else if(this.miles < other.miles){
            return 1;
        } else{
            return 0;
        }
    }


    public boolean equals(Chevy other){
        if (this.model.equals(other.model) && this.color.equals(other.color)){
            if ((this.miles > 200) == (other.miles > 200)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public String toString(){
        calcPrice();
        String stringChevy = "\n**************************************************\n";
        stringChevy += year+" "+MAKE+" "+model+" ("+color+")\n\t";
        stringChevy += "BASE PRICE:\t\t\t$"+basePrice+"\n\tMILES:\t\t\t\t"+miles;
        stringChevy += "\n\tFUEL EFFICIENCY:\t"+mpg+" mpg\n\tPACKAGES:\n\t\t";
        if (luxuryPkg == true){
            stringChevy += "- Luxury Package\n\t\t";
        }
        if (sportsPkg == true){
            stringChevy += "- Sports Package\n\t\t";
        }
        if (FWDPkg == true){
            stringChevy += "- 4WD Package Package\n\t\t";
        }
        if (FWDPkg != true && luxuryPkg != true && sportsPkg != true){
            stringChevy += "- None\n\n\t";
        }
        if (FWDPkg == true || luxuryPkg == true || sportsPkg == true){
            stringChevy += "\n\t";
        }
        stringChevy += "PRICE WITH UPGRADES:\t$"+priceWithUpgrades+"\n\tFINAL PRICE WITH TAX:\t$"+grandTotal+"\n";
        stringChevy += "**************************************************\n";
        return stringChevy;
    }


    public void calcPrice(){
         priceWithUpgrades = basePrice;
        if (luxuryPkg == true){
            priceWithUpgrades += basePrice * LUX_PKG_PRIC;
        }
        if (FWDPkg == true){
            priceWithUpgrades += FOURWD_PKG_PRICE;
        }
        if (sportsPkg == true){
            priceWithUpgrades += basePrice * SPORTS_PKG_PRICE;
            mpg = (mpg * SPORTS_PKG_MPG);
        }
        grandTotal = priceWithUpgrades * TAX_RATE;

        // checks for and adds on any additions and adds tax
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
        calcPrice();
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(double priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        calcPrice();
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getMake() {
        return MAKE;
    }
}

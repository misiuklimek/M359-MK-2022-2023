package UN7.TicketMasterLab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Show {
    private String date;
    private double price;
    private int qty;
    private String artist;
    private String city;

    /**
     *
     * @param date
     * @param price
     * @param qty
     * @param artist
     * @param city
     */
    public Show(String date, double price, int qty, String artist, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.artist = artist;
        this.city = city;
    }

    public String toString(){
        String output = date+"\t$"+price+"\t"+qty+"\t"+artist+"\t\t\t"+city;
        return output;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}




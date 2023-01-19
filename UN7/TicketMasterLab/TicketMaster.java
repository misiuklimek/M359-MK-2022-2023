package UN7.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows;
    private int numOptions;
    private String fileName;
    boolean ifQuit;

    public static void continueSite(Boolean ifQuit, ArrayList<Show> shows){
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == 6){
            ifQuit = true;
        }
        while (!ifQuit){


            if(answer == 5){
                System.out.println("Shows are sorted by Price (Descending)");
                sortByPriceDescending();
                System.out.println(shows.toString());
                System.out.println("\n"+options());
            } else if (answer == 4) {
                System.out.println("Shows are sorted by Price (Ascending)");
                sortByPriceAscending();
                System.out.println(shows.toString());
                System.out.println("\n"+options());
            } else if (answer == 3) {
                System.out.println("Shows are sorted by Performer (Z-A)");
                sortByPerformerZ();
                System.out.println(shows.toString());
                System.out.println("\n"+options());
            } else if (answer == 2) {
                System.out.println("Shows are sorted by Performer (A-Z)");
                sortByPerformerA();
                System.out.println(shows.toString());
                System.out.println("\n"+options());
            } else if (answer == 1) {
                sortByCity();
                System.out.println("Shows are sorted by City");
                System.out.println(shows.toString());
                System.out.println("\n"+options());
            }
            answer = input.nextInt();
            if (answer == 6){
                ifQuit = true;
            }

        }
    }

    public TicketMaster(String fileName) {
        this.fileName = fileName;
        this.numOptions = 0;
        this.shows = new ArrayList<Show>();
        this.ifQuit = false;
    }

    public void loadFile() throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner fileIn = new Scanner(myFile);
        while (fileIn.hasNext()){
            String date = fileIn.next();
            double price = fileIn.nextDouble();
            int qty = fileIn.nextInt();


            String restOfStr = fileIn.nextLine();
            int index = restOfStr.indexOf(",");
            String artist = restOfStr.substring(0,index);


            String city = restOfStr.substring(index+2);


            Show temp = new Show(date, price, qty, artist, city);
            shows.add(temp);
            numOptions++;
        }
    }


    public static void sortByPriceDescending(){

    }

    public static void sortByPriceAscending(){

    }

    public static void sortByPerformerA(){

    }

    public static void sortByPerformerZ(){

    }

    public static void sortByCity(){

    }

    public void start(){
        System.out.println("\t\t\t\t*** Welcome To TicketMaster ***\n\tYou may search shows by cities, performer, as well as price!");
        System.out.println("\t\tPlease select one of the following options!\n\n" + options());

        continueSite(ifQuit, shows);
    }
    public static String options(){
        String output = "1. Search by city\n2. Sort by " +
        "Performer (A-Z)\n3. Search by Performer (Z-A)\n4. Sort by Price (Low-High)\n5. Sort by Price (High-Low)\n6. Quit";
        output += "\nEnter a value between 1-6:";
        return output;
    }

    public String toString(){
        String output = "Date\t\tPrice\tQty\t Performer\t\t\t  City\n-------------------------------------------------------\n";
        for(Show concert : shows){
            output += concert.toString();
        }
        return output;

    }
}

package UN7.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TicketMaster {
    private ArrayList<Show> shows;
    private int numOptions;
    private String fileName;
    boolean ifQuit;

    public static String recordResponseString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static int recordResponse(){
        Scanner input = new Scanner(System.in);
        boolean tryAgain = true;
        int answer = 0;
        while (tryAgain){
            try {
                answer = input.nextInt();
                if (answer < 7 && answer > 0){
                    tryAgain = false;
                } else{
                    System.out.println("Invalid Entry, please try a number between 1-6!");
                }
            } catch (Exception e){
                System.out.println("Invalid Entry, please try again using an integer!");
                input.nextLine();
            }
        }
        input.nextLine();
        return answer;
    }
    public static void continueSite(Boolean ifQuit, ArrayList<Show> shows){
        int answer = recordResponse();
        if (answer == 6){
            ifQuit = true;
        }
        while (!ifQuit){

            if(answer == 5){
                System.out.println("\nShows are sorted by Price (Descending)");
                sortByPriceDescending(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 4) {
                System.out.println("\nShows are sorted by Price (Ascending)");
                sortByPriceAscending(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 3) {
                System.out.println("\nShows are sorted by Performer (Z-A)");
                sortByPerformerZ(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 2) {
                System.out.println("\nShows are sorted by Performer (A-Z)");
                sortByPerformerA(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 1) {
                System.out.println("Please enter a city:");
                ArrayList<Show> temp;
                temp = sortByCity(shows);
                if (temp.size() == 0){
                    System.out.println("Sorry! There are no shows in this city!\nPlease try another search (1-6):");
                } else {
                    System.out.println("\nShows are sorted by City");
                    System.out.println(optionsToString(temp));
                    System.out.println("\n" + options());
                }
            }
            answer = recordResponse();
            if (answer == 6){
                ifQuit = true;
            }

        }
    }

    public TicketMaster(String fileName) {
        this.fileName = fileName;
        this.numOptions = 0;
        this.shows = new ArrayList<>();
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

//*
    public static void sortByPriceDescending(ArrayList<Show> shows){

    }


    public static void sortByPriceAscending(ArrayList<Show> shows){

    }


    public static void sortByPerformerA(ArrayList<Show> shows){

    }

    public static void sortByPerformerZ(ArrayList<Show> shows){

    }

    public static ArrayList<Show> sortByCity(ArrayList<Show> shows){
        String cityPicked = recordResponseString();
        ArrayList<Show> outputArray = new ArrayList<>();
        for (Show curShow : shows){
            if (curShow.getCity().equalsIgnoreCase(cityPicked)){
                outputArray.add(curShow);
            }
        }

        return outputArray;
    }

    public void start(){
        System.out.println("\t\t\t\t*** Welcome To TicketMaster ***\n\tYou may search shows by cities, performer, as well as price!");
        System.out.println("\t\tPlease select one of the following options!\n\n" + options());

        continueSite(ifQuit, shows);
    }
    public static String options(){
        String output = "1. Search by city\n2. Sort by " +
        "Performer (A-Z)\n3. Search by Performer (Z-A)\n4. Sort by Price (Low-High)\n5. Sort by Price (High-Low)\n6. Quit\n";
        output += "\nEnter a value between 1-6:";
        return output;
    }

    public static String optionsToString(ArrayList<Show> shows){
        String output = "Date\t\tPrice\tQty\t Performer\t\t\t  City\n-------------------------------------------------------\n";
        for(Show concert : shows){
            output += concert.toString();
        }
        return output;

    }
}

package UN7.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TicketMaster {
    private ArrayList<Show> shows;
    private int numOptions;
    private String fileName;
    boolean ifQuit;

    /**
     * Reads the users input in the format of a string
     * @return String of response
     */
    public static String recordResponseString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * Records the response of the reader as an integer. If the user inputs a bad response
     * method uses catch blocks to catch the type of mistake and allow the user to try again.
     * @return Int of users response
     */
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

    /**
     * Void method that reads the reader's response using recordResponse method and then repeats until user
     * chooses quit option. While method is running, response is used to alter array and print the adjusted array
     * with description to reader. This is done by calling static methods that either create a new array
     * or alter the shows arrayList to specified order.
     * @param ifQuit Boolean of if the method should continue or end
     * @param shows arrayList of shows
     */
    public static void continueSite(Boolean ifQuit, ArrayList<Show> shows){
        int answer = recordResponse();              //Records the users first choice

        while (!ifQuit){            //While loop continues while ifQuit is false
            if (answer == 6){
                ifQuit = true;
                System.out.println("\nThank you for using Ticket Master!\n\t\tHave a great Day!");
            } else if(answer == 5){             //Orders in price descending and prints
                System.out.println("\nShows are sorted by Price (Descending)");
                sortByPriceDescending(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 4) {           //Orders in price ascending and prints
                System.out.println("\nShows are sorted by Price (Ascending)");
                sortByPriceAscending(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 3) {           //Orders shows by artist alphabetically starting with z to a
                System.out.println("\nShows are sorted by Performer (Z-A)");
                sortByPerformerZ(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 2) {           //Orders shows by artist alphabetically starting with a to z
                System.out.println("\nShows are sorted by Performer (A-Z)");
                sortByPerformerA(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == 1) {           //allows reader to input a city and prints new array of just the cities requested
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


        }
    }

    /**
     * Constructor that creates an array for shows and holds the name of the show file
     * @param fileName Name path for show doc
     */
    public TicketMaster(String fileName) {
        this.fileName = fileName;
        this.numOptions = 0;
        this.shows = new ArrayList<>();
        this.ifQuit = false;
    }

    /**
     * Scans in show file and creates new scanner object. Uses while loop
     * @throws FileNotFoundException if file path not found
     */
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


    public static void sortByPriceDescending(ArrayList<Show> shows){
        //for(int i=0;i<shows.size();i++){ //repeats grabbing first show and moving upwards through array
         //   for(int j=i+1;j<shows.size();j++){ //repeats grabbing the next show in the array
          //      Show tempI=shows.get(i);
           //     Show tempJ=shows.get(j);
           //     if(tempI.getPrice()<tempJ.getPrice()){ // compares the first show with the next show in the array and
          //          shows.set(i,tempJ);                // rearranges them by size if in wrong order
         //           shows.set(j,tempI);
         //       }
        //    }
       // }
    }

    public static void sortByPriceAscending(ArrayList<Show> shows){
        //for(int i=0;i<shows.size();i++){        //repeats grabbing first show and moving upwards through array
        //    for(int j=i+1;j<shows.size();j++){  //repeats grabbing the next show in the array
        //        Show tempI=shows.get(i);
        //        Show tempJ=shows.get(j);
         //       if(tempI.getPrice()>tempJ.getPrice()){  // compares the first show with the next show in the array and
         //           shows.set(i,tempJ);                 // rearranges them by size if in wrong order
         //           shows.set(j,tempI);
         //       }
        //    }
       // }

    }



    public static void sortByPerformerA(ArrayList<Show> shows){
       // for(int i=0;i<shows.size();i++){ //repeats grabbing first show and moving upwards through array
        //    for(int j=i+1;j<shows.size();j++){ //repeats grabbing the next show in the array
       //         Show tempI=shows.get(i);
       //         Show tempJ=shows.get(j);
       //         if(tempI.getArtist().compareToIgnoreCase(tempJ.getArtist()) > 0){ // compares the first show with the next show in the array and
       //             shows.set(i,tempJ);                // rearranges them by size if in wrong order
       //             shows.set(j,tempI);
       //         }
       //     }
      //  }
        for(int i=0; i<shows.size()-1;i++){
            int min = i;
            for (int j = i+1;j<shows.size();j++){
                if (shows.get(j).getArtist().compareToIgnoreCase(shows.get(min).getArtist()) > 0){
                    min = j;
                }
                if (j != min) {
                    Show temp = shows.get(j);
                    shows.set(j, shows.get(min));
                    shows.set(min, temp);
                }
            }
        }
    }


    public static void sortByPerformerZ(ArrayList<Show> shows){
     //   for(int i=0;i<shows.size();i++){        //repeats grabbing first show and moving upwards through array
      //      for(int j=i+1;j<shows.size();j++){  //repeats grabbing the next show in the array
      //          Show tempI=shows.get(i);
       //         Show tempJ=shows.get(j);
      //          if(tempI.getArtist().compareToIgnoreCase(tempJ.getArtist()) < 0){       // compares the first show with the next show in the array and
      //             shows.set(i,tempJ);                                                 // rearranges them by size if in wrong order
       //             shows.set(j,tempI);
       //         }
       //     }
      //  }
    }

    /**
     * Finds the lowest alphabetical value of an artist name meant for selection sorting
     * @param list Arraylist of shows
     * @return lowest alphabetical show
     */
    public static Show findMin(ArrayList<Show> list) {
        Show lowestVal = list.get(0);
        for (Show curShow : list){
            if (curShow.getArtist().compareTo(lowestVal.getArtist()) > 0){
                lowestVal = curShow;
            }
        }
        return lowestVal;
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

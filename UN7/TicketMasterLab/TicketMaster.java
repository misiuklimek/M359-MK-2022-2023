package UN7.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TicketMaster {
    private ArrayList<Show> shows;
    private int numOptions;
    private String fileName;
    private boolean ifQuit;
    private final int QUIT=6;
    private final int PRICE_DESCENDING=5;
    private final int PRICE_ASCENDING=4;
    private final int ARTIST_Z_A=3;
    private final int ARTIST_A_Z=2;
    private final int SEARCH_CITY=1;


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
    public void continueSite(Boolean ifQuit, ArrayList<Show> shows){
        int answer = recordResponse();              //Records the users first choice

        while (!ifQuit){            //While loop continues while ifQuit is false
            if (answer == QUIT){
                ifQuit = true;
                System.out.println("\nThank you for using Ticket Master!\n\t\tHave a great Day!");
            } else if(answer == PRICE_DESCENDING){             //Orders in price descending and prints
                System.out.println("\nShows are sorted by Price (Descending)");
                sortByPriceDescending(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == PRICE_ASCENDING) {           //Orders in price ascending and prints
                System.out.println("\nShows are sorted by Price (Ascending)");
                sortByPriceAscending(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == ARTIST_Z_A) {           //Orders shows by artist alphabetically starting with z to a
                System.out.println("\nShows are sorted by Performer (Z-A)");
                sortByPerformerZ(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == ARTIST_A_Z) {           //Orders shows by artist alphabetically starting with a to z
                System.out.println("\nShows are sorted by Performer (A-Z)");
                sortByPerformerA(shows);
                System.out.println(optionsToString(shows));
                System.out.println("\n"+options());
            } else if (answer == SEARCH_CITY) {           //allows reader to input a city and prints new array of just the cities requested
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
     * Scans in show file and creates new scanner object. Uses while loop to continue to create Show objects
     * until the documnt ends.
     * @throws FileNotFoundException if file path not found
     */
    public void loadFile() throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner fileIn = new Scanner(myFile);
        while (fileIn.hasNext()){               //repeats until end of test document
            String date = fileIn.next();        //reads Show attributes into temp objects
            double price = fileIn.nextDouble();
            int qty = fileIn.nextInt();

            String restOfStr = fileIn.nextLine();       //Splits line into substrings to read in objects accordingly
            int index = restOfStr.indexOf(",");
            String artist = restOfStr.substring(1,index);

            String city = restOfStr.substring(index+2);

            Show temp = new Show(date, price, qty, artist, city);      //Constructs new Show object
            shows.add(temp);                    //adds Show into ArrayList
            numOptions++;
        }
    }

    /**
     * Employs Insertion sort in order to organize and update the array in descending price order
     * @param shows Arraylist of Show objects
     */
    public static void sortByPriceDescending(ArrayList<Show> shows){
        //Repeats for every value in the array
        for(int i=1; i<shows.size(); i++)   {
            //Sets a temporary Show to be added after show is set
            Show temp = shows.get(i);
            int j= i-1;
            //Continues code until correct value is switched
            while(j >=0 && temp.getPrice() >= shows.get(j).getPrice())   {
                shows.set(j+1,shows.get(j));
                j--;
            }
            //Re-adds show that was set over
            shows.set(j+1,temp);
        }

    }

    /**
     * Employs Insertion sort in order to organize and update the array in ascending price order
     * @param shows Arraylist of Show objects
     */
    public static void sortByPriceAscending(ArrayList<Show> shows){
        //Repeats for every value in the array
        for(int i=1; i<shows.size(); i++)   {
            //Sets a temporary Show to be added after show is set
            Show temp = shows.get(i);
            int j= i-1;
            //Continues code until correct value is switched
            while(j >=0 && temp.getPrice() <= shows.get(j).getPrice())   {
                shows.set(j+1,shows.get(j));
                j--;
            }
            //Re-adds show that was set over
            shows.set(j+1,temp);
        }

    }


    /**
     * Employs Selection sort to sort and update the array in alphabetical order from A-Z. Compares objects
     * using the compareTo function.
     * @param shows Arraylist of Show objects
     */
    public static void sortByPerformerA(ArrayList<Show> shows){
        for(int i=0; i<shows.size()-1;i++){
            int min = i;
            //Checks if the first is smaller and then sets the minimum index to new value
            for (int j = i+1;j<shows.size();j++) {
                if (shows.get(j).getArtist().compareTo(shows.get(min).getArtist()) < 0) {
                    min = j;
                }
            }
            //Rearranges the two values to make the lower value go first
            Show temp = shows.get(i);
            shows.set(i, shows.get(min));
            shows.set(min, temp);
        }
    }

    /**
     * Employs Selection sort to sort and update the array in reverse alphabetical order from Z-A.
     * Function compares objects using the compareTo function.
     * @param shows Arraylist of Show objects
     */
    public static void sortByPerformerZ(ArrayList<Show> shows){
        for(int i=0; i<shows.size()-1;i++) {
            int max = i;
            for (int j = i + 1; j < shows.size(); j++) {
                //Checks if the first is smaller and then sets the max index to new value
                if (shows.get(j).getArtist().compareTo(shows.get(max).getArtist()) > 0) {
                    max = j;
                }
            }
            //Rearranges the two values to make the higher value go first
            Show temp = shows.get(i);
            shows.set(i, shows.get(max));
            shows.set(max, temp);
        }
    }

    /**
     * Uses a helper function to ask the user what city he is looking for. Creates an output array and
     * searches through the array to find and add every instance of the city into the output array.
     * @param shows ArrayList of shows
     * @return ArrayList of cities searched for
     */
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

    /**
     * Prints the beginning message and the users first options
     */
    public void start(){
        System.out.println("\t\t\t\t*** Welcome To TicketMaster ***\n\tYou may search shows by cities, performer, as well as price!");
        System.out.println("\t\tPlease select one of the following options!\n\n" + options());


    }

    /**
     * Turns the users options for search into a string
     * @return User options String
     */
    public static String options(){
        String output = "1. Search by city\n2. Sort by " +
        "Performer (A-Z)\n3. Search by Performer (Z-A)\n4. Sort by Price (Low-High)\n5. Sort by Price (High-Low)\n6. Quit\n";
        output += "\nEnter a value between 1-6:";
        return output;
    }

    /**
     * Converts the inputted ArrayList's Show objects into a display of Shows in a chart
     * @param shows ArrayList of Shows
     * @return String of Shows and their attributes
     */
    public static String optionsToString(ArrayList<Show> shows){
        String output = "Date\t\tPrice\tQty\t Performer\t\t\t  City\n-------------------------------------------------------\n";
        for(Show concert : shows){
            output += concert.toString();
        }
        return output;

    }

    public boolean isIfQuit() {
        return ifQuit;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }
}

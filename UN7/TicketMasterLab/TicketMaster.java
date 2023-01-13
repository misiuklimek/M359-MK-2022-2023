package UN7.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows;
    private int numOptions;

    public TicketMaster() {
        this.numOptions = 0;
    }

    public void loadFile(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner fileIn = new Scanner(myFile);
        while (fileIn.hasNext()){
            String date = fileIn.next();
            double price = fileIn.nextDouble();
            int qty = fileIn.nextInt();


            String tempArt = fileIn.next();
            int index = tempArt.indexOf(",");
            String artist = tempArt.substring(0,index);


            String city = fileIn.next();


            Show temp = new Show(date, price, qty, artist, city);
            shows.add(temp);
        }
    }
}

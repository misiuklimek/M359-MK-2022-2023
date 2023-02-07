package UN7.TicketMasterLab;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster tester = new TicketMaster("showData.txt");
        //Reads file of shows
        tester.loadFile();
        //Starts and prompts user first time
        tester.start();
        //Continues search until user quits
        tester.continueSite(tester.isIfQuit(), tester.getShows());
    }
}

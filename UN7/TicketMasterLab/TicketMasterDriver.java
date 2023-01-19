package UN7.TicketMasterLab;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster tester = new TicketMaster("showData.txt");
        tester.loadFile();
        tester.start();
    }
}

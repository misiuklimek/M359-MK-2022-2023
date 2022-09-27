package U3;

public class CompoundBooleanEX {
    public static void main(String[] args) {
        String day = "Saturday";
        int numHwAssignments = 2;

        if (day.equals("Saturday") || numHwAssignments == 0) {
            System.out.println("Yay, video games!");
        } else {
            System.out.println("I guess I'll have to wait :(");
        }

        if (day.equals("Monday") && (numHwAssignments <= 2)) {
            System.out.println("Yay, coding club!");
        } else {
            System.out.println("Today is a sad day :(");
        }

        if ((!day.equals("Saturday") || !day.equals("Sunday")) && numHwAssignments == 0) {
            double num = Math.random();
            if (num <= .8) {
                System.out.println("Exercise");
            } else if (num >= .8) {
                System.out.println("No exercise");
            }
        } else if ((!day.equals("Saturday") || !day.equals("Sunday")) && !(numHwAssignments == 0)) {
            double num = Math.random();
            if (num <= .3) {
                System.out.println("Exercise");
            } else if (num >= .3) {
                System.out.println("No exercise");
            }
        } else {
            System.out.println("Exercise");
        }

    }
    //1. Alice loves video games. She plays video games if its saturday or if she doesnt have any hw. Print out
    //either "Yay, video games!" or "I guess I'll have to wait :("


}
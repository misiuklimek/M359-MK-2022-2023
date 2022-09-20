package U2_;

import java.util.Scanner;

public class MathExamplesWS5 {
    /*
     *   Michael Klimek
     *   Mr. Moon - Period 7
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompts user for values of two points
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();

        System.out.println("Enter y1: ");
        int y1 = input.nextInt();

        System.out.println("Enter x2: ");
        int x2 = input.nextInt();

        System.out.println("Enter y2: ");
        int y2 = input.nextInt();

        //Finds and prints distance
        double distance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 +") is " + distance + "\n");



        //Prompts user for value of min and max values of random number
        System.out.println("What is the max? ");
        int maxValue = input.nextInt();
        System.out.println("What is the min? ");
        int minValue = input.nextInt();
        int randomized = (int)(Math.random() * (maxValue - minValue +1)) + minValue;
        System.out.println("\nYour random number: " + randomized + "\n\nExtra Info:");


        //Prints the absolute value for the randomly generated number
        System.out.println("The absolute value of your number: " + Math.abs(randomized));
        //Cubes your random number
        System.out.println("The cube of your number: " + Math.pow(randomized, 3));
        //Gives the user the bigger x value and the lesser y value
        System.out.println("Smallest x-value: " + Math.max(x1, x2));
        System.out.println("Largest x-value: " + Math.min(y1, y2));
    }

}

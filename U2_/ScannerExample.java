package U2_;
//MEMORIZE THIS!!!
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user for name
        System.out.println("\nWhat is your name?");
        String name = input.nextLine();

        System.out.println("Your name is " + name + "!\n");

        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("Your age is " + age + "!\n");

        System.out.println("What is your GPA?");
        double gpa = input.nextDouble();
        System.out.println("Your GPA is " + gpa + "!");
    }




}

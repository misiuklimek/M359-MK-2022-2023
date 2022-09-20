package U1_PrimitiveTypes;

public class Example_1_3 {
    public static void main(String[] args) {
        System.out.print("Hello World!\n\n");

        // You're throwing a pizza party! Create variables
        //  for the # of guests, as well as the # of pizzas

        int pizzaCount = 3;
        int guestCount = 5;

        // 1. Use a system.out.print statement to display a
        //  summary of the party so far

        System.out.println("So far we have " + guestCount + " guests who are enjoying " + pizzaCount + " pizzas!\n");

        // 2. But wait! 2 more guests just showed up with
        //  4 extra pizzas.

        guestCount = guestCount + 2;
        pizzaCount = pizzaCount + 4;

        System.out.println("\tWe now have " + guestCount + " guests and " + pizzaCount + " pizzas!\n");

        // 3. Display the ones digit of a given integer.

        int num = 1872;
        num %= 10;
        System.out.println("Num's first digit is " + num);

        // 4. Display 10s digit

        int num2 = 1782;
        num2 %= 100;
        num2 /= 10;
        System.out.println("Num's second digit is " + num2);

        // 1.4:

        double avgPizza = (double)pizzaCount/guestCount;
        System.out.println(avgPizza);

        // 4. D
    }
}

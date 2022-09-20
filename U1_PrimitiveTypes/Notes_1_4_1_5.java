package U1_PrimitiveTypes;

public class Notes_1_4_1_5 {
    public static void main(String[] args) {
        // 1. Given a decimal number (double),truncate the decimals
        //  and display the resulting whole number.

        double width = 12.5674534;
        width = (int)width;
        System.out.println(width);

        // 2. Given an integer, display it truncated to the hundreds place
        int population = 8132789;
        int newPop = population / 100 * 100;
        System.out.println(newPop);

        int population2 = 8132789;
        int xPop2 = population2 % 100;
        int newPop2 = population2 - xPop2;
        System.out.println(newPop2);

        // 3. Given a double, display it rounded to the nearest int
        double height = 7.89;

        int newHeight = (int)(height + 0.5);
        System.out.println(newHeight);



    }
}

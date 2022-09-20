package U2_;

public class WrapperExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        //Create a wrapper integer
        Integer wrappedInt = new Integer(6);
        System.out.println(wrappedInt.intValue());

        // Create a boxed integer using autoboxing
        Integer wrappedInt2 = 8;
        System.out.println(wrappedInt2);

        // create a wrapped double
        Double wrappedDouble = 10.25;
        System.out.println(wrappedDouble);

        // display the min and max value of int
        System.out.println(Integer.MAX_VALUE + " \\/ " + Integer.MIN_VALUE);

        double d1 = 10.0;

        Double d2 = 20.0;

        Double d3 = new Double(30.0);

        double d4 = new Double(40.0);



        System.out.println(d1 + d2 + d3.doubleValue() + d4);
        
    }
}

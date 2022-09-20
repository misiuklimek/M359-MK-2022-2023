package U2_;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";

        //prints length of string characters
        System.out.println(s1.length());
        //prints out string but in all caps
        System.out.println(s1.toUpperCase());
        //prints out s1 WITHOUT capitals bc previous did not set it, js print
        System.out.println(s1);
        //prints out location of u
        System.out.println(s2.indexOf("u"));
        //tries to print location of x, no x so it prints -1
        System.out.println(s2.indexOf("x"));
        //prints characters after/with the 4th character as a substring
        System.out.println(s1.substring(4));
        //prints out the substring in between 2 and 5 characters w/o 5
        System.out.println(s1.substring(2,5));
        //prints the amount of characters in string 2
        System.out.println(s2.length());
        //finds out if the two substrings have equal characters
        boolean isEqual = s1.equals(s2);
        //prints if they are equal or not
        System.out.println(isEqual);


        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";
        //compares  to find out which one comes first alphabetically
        System.out.println(s3.compareTo(s5));
        //negative means comes before
        System.out.println(s3.compareTo(s4));



    }

}

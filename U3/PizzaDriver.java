package U3;

public class PizzaDriver {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("CPA", 14, 2, true);
        Pizza p2 = new Pizza("Little Ceasars", 14, 1, false);

        p1.printInfo();
        p2.printInfo();

        String p1Desc = p1.toString();
        System.out.println(p1Desc);

        System.out.println(p1.equals(p2));
        System.out.println(p1.compareTo(p2));
    }
}

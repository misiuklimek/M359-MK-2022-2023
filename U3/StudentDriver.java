package U3;

public class StudentDriver {
    public static void main(String[] args) {
        Student kicius = new Student("Michal", "Klimek", 121875);
        Student kicius2 = new Student("Julia", "Podstawka", 124990);

        System.out.println(kicius.compareTo(kicius2));
    }


}

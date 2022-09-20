package U2_;

public class StudentDriver {
    public static void main(String[] args) {
        System.out.println("hello");

        Student s1 = new Student("Michael", 12, 4.47);
        Student s2 = new Student("Julia", 12, 4.46);
        s1.printInfo();
        s2.printInfo();
        s1.setGrade(10);
        s1.printInfo();

        System.out.println(s1.getGrade());


    }
}

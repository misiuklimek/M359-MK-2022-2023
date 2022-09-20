package U2_;

public class Student {
    //instance variables
    private int grade;
    private double gpa;
    private String name;

    //constructor
    public Student(String studentName, int studentGrade, double studentGpa) {
        grade = studentGrade;
        gpa = studentGpa;
        name = studentName;

    }
    public Student(String studentName){
        name = studentName;
        grade = 9;
        gpa = 3.5;

    }

    //methods
    public void printInfo(){
        System.out.println("Name: " + name + "\nGrade: " + grade + "\nGPA: " + gpa);
        System.out.println();
    }

    public void setGrade(int newGrade){
        grade = newGrade;
    }

    public int getGrade(){
        return grade;
    }
}



package U3.ShoeCourseJUnitExample;

public class Course {
    //private variables
    private String classTitle;
    private int numStudentsEnrolled;
    private String teacherName;

    //constructors
    public Course(String classTitle, int numStudentsEnrolled, String teacherName) {
        this.classTitle = classTitle;
        this.numStudentsEnrolled = numStudentsEnrolled;
        this.teacherName = teacherName;
    }

    //methods

    public boolean equals(Course others){
        if (this.getTeacherName().equals(others.getTeacherName()) && this.numStudentsEnrolled == others.numStudentsEnrolled){
            return true;
        } else{
            return false;
        }
    }

    public int compareTo(Course other){
        if (this.getClassTitle().compareTo(other.getClassTitle()) < 0){
            return -1;
        }
        else if (this.getClassTitle().compareTo(other.getClassTitle()) > 0){
            return 1;
        }
        else{
            if(this.getNumStudentsEnrolled() < other.getNumStudentsEnrolled()){
                return -1;
            }
            else if(this.getNumStudentsEnrolled() > other.getNumStudentsEnrolled()){
                return 1;
            }
            else {
                return 0;
            }
        }
    }


    //getset methods
    public String getClassTitle() {
        return classTitle;
    }
    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }
    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }
    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}

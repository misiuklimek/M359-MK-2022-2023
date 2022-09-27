package U3;

public class Student {
    //private variables
    private String fName;
    private String lName;
    private int idNum;


    //constructor
    public Student(String fName, String lName, int idNum){
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    //methods
    public boolean ifEquals(Student other){
        if (this.getfName() == other.getfName() && this.getlName() == other.getlName()){
            return true;
        }else{
            return false;
        }
    }

    public int compareTo(Student other){
        int compared = this.getlName().compareTo(other.getlName());
        if (compared == 0){
            return this.getfName().compareTo(other.getfName());
        }else{
            return compared;
        }
    }



    //get/set methods
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getIdNum() {
        return idNum;
    }
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}

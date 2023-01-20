package U6.TriviaLab;

public class Question {
    //Instance Variables
    private int pointAmt;
    private String question;
    private String[] answers;
    private String correctA;
    private boolean ifUsed;


    //Constructor
    public Question(int pointAmt, String question, String[] answers, String correctA) {
        this.pointAmt = pointAmt;
        this.question = question;
        this.answers = answers;
        this.correctA = correctA;
        this.ifUsed = false;        //Changed if the question is used, so it will not be repeated
    }



    //Methods:

    /**
     * Converts the question into a string that is readable to the player.
     * @return String containing question and answer options
     */
    public String toString(){
        return question +" ("+pointAmt+")\n\t"+answers[0]+"\n\t"+answers[1]+"\n\t"+answers[2]+"\n\t"+answers[3]+"\nAnswer:";
    }




    // Getters and Setters:
    public int getPointAmt() {
        return pointAmt;
    }

    public void setPointAmt(int pointAmt) {
        this.pointAmt = pointAmt;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getCorrectA() {
        return correctA;
    }

    public void setCorrectA(String correctA) {
        this.correctA = correctA;
    }

    public boolean isIfUsed() {
        return ifUsed;
    }

    public void setIfUsed(boolean ifUsed) {
        this.ifUsed = ifUsed;
    }
}

package U6.TriviaLab;

public class Question {
    private int pointAmt;
    private String question;
    private String[] answers;
    private String correctA;
    private boolean ifUsed;

    public Question(int pointAmt, String question, String[] answers, String correctA) {
        this.pointAmt = pointAmt;
        this.question = question;
        this.answers = answers;
        this.correctA = correctA;
        this.ifUsed = false;
    }

    public String toString(){
        return question +"\n\t"+answers[0]+"\n\t"+answers[1]+"\n\t"+answers[2]+"\n\t"+answers[3];
    }




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

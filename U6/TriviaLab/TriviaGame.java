package U6.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] questions;
    private int pts;
    private int correct;
    private int wrong;
    private String textFileName;
    private String playerName;
    private int streak;
    private int questionsDone;
    private int numQuestions;

    public TriviaGame(String fileName) {
        this.questions = new Question[0];
        this.pts = 0;
        this.correct = 0;
        this.wrong = 0;
        this.textFileName = fileName;
        this.playerName = "";
        this.streak = 0;
        this.questionsDone = 0;
        this.numQuestions = 0;
    }

    public void readQuestionFile() throws FileNotFoundException {
        File myFile = new File(textFileName);
        Scanner fileIn = new Scanner(myFile);
        numQuestions = fileIn.nextInt();
        fileIn.nextLine();      // dummy read

        questions = new Question[numQuestions];
        for (int i = 0; i < numQuestions; i++){
            String questionAsk = fileIn.nextLine();
            
            int amtOfPts = fileIn.nextInt();
            fileIn.nextLine();

            String[] answersArr = new String[4];
            for (int j =0;j<4;j++){
                answersArr[j] = fileIn.nextLine();

            }
            String correctAns = fileIn.nextLine();
            Question ques = new Question(amtOfPts, questionAsk, answersArr, correctAns);
            questions[i] = ques;

        }
    }

    public void startGame() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("*#* WELCOME TO MICHAEL'S TRIVIA *#*\nYou will earn points for every correct question!\nWhat is your name?");
        playerName = input.nextLine();
        System.out.println("Lets Start " + playerName + "! Please answer with the letter of your chosen answer!\n");
    }

    public void finishGame(){
        System.out.println("\n\nThank you for Playing! Here are your final stats:");
        System.out.println(statsToString());
        System.out.println("Correct Percent: " + (correct/numQuestions));
        System.out.println("Thank you again! Have a great day!");
    }



    public void getNextQuestion() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Question output = getRandomQuestion();
        while (output.isIfUsed()){
            output = getRandomQuestion();
        }
        output.setIfUsed(true);
        System.out.println(output);
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase(output.getCorrectA())){
            correct++;
            streak++;
            pts += output.getPointAmt();
            System.out.println("Congratulations! Your answer is correct!\n");
        } else{
            wrong++;
            streak = 0;
            System.out.println("Oops! Your answer is incorrect.\n");
        }
        System.out.println(statsToString());
    }

    public String statsToString(){
        String output = "Total Correct: "+correct+"\nTotal Incorrect: "+wrong;
        output += "\nCurrent Streak: "+streak+"\nPoints Earned: "+pts;
        return output;
    }

    public Question getRandomQuestion() throws FileNotFoundException {
        File myFile = new File(textFileName);
        Scanner fileIn = new Scanner(myFile);
        int numQuestions = fileIn.nextInt();
        int randomNum = (int)(Math.random()*(numQuestions));
        return questions[randomNum];
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public String getTextFileName() {
        return textFileName;
    }

    public void setTextFileName(String textFileName) {
        this.textFileName = textFileName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getQuestionsDone() {
        return questionsDone;
    }

    public void setQuestionsDone(int questionsDone) {
        this.questionsDone = questionsDone;
    }
}

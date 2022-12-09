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

    public TriviaGame(String fileName) {
        this.questions = new Question[0];
        this.pts = 0;
        this.correct = 0;
        this.wrong = 0;
        this.textFileName = fileName;
        this.playerName = "";
    }

    public void readQuestionFile() throws FileNotFoundException {
        File myFile = new File(textFileName);
        Scanner fileIn = new Scanner(myFile);
        int numQuestions = fileIn.nextInt();
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

    public void startGame(){
        Scanner input = new Scanner(System.in);
        System.out.println("*#* WELCOME TO MICHAEL'S TRIVIA *#*\nYou will earn points for every correct question!\nWhat is your name?");
        playerName = input.nextLine();
        System.out.println("Lets Start " + playerName + "!");

    }



    public Question getNextQuestion() throws FileNotFoundException {
        Question output = getRandomQuestion();
        while (output.isIfUsed()){
            output = getRandomQuestion();
        }
        return output;
    }


    public Question getRandomQuestion() throws FileNotFoundException {
        File myFile = new File(textFileName);
        Scanner fileIn = new Scanner(myFile);
        int numQuestions = fileIn.nextInt();
        int randomNum = (int)(Math.random()*(numQuestions+1));
        return questions[randomNum];
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
}

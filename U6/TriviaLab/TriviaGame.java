package U6.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {

    //Instance Variables

    private Question[] questions;
    private int pts;
    private int correct;
    private int wrong;
    private String textFileName;
    private String playerName;
    private int streak;
    private int questionsDone;
    private int numQuestions;





    //Constructor

    public TriviaGame(String fileName) {
        this.questions = new Question[0];
        this.pts = 0;
        this.correct = 0;
        this.wrong = 0;
        this.textFileName = fileName;       //holds game file name
        this.playerName = "";
        this.streak = 0;                    //Holds current streak
        this.questionsDone = 0;
        this.numQuestions = 0;              //total number of questions in game
    }





    //Methods:

    /**
     * Method inputs the game file and reads the number of questions and each individual question into a question
     * array. Each question array filled also fills a question answer array. Method assigns these arrays
     * and value to the game it is used on.
     * @throws FileNotFoundException Shows error if file not found
     */
    public void readQuestionFile() throws FileNotFoundException {
        File myFile = new File(textFileName);
        Scanner fileIn = new Scanner(myFile);       //Scans in file
        numQuestions = fileIn.nextInt();
        fileIn.nextLine();      // dummy read

        questions = new Question[numQuestions];
        for (int i = 0; i < numQuestions; i++){     //Repeats to fill every question spot
            String questionAsk = fileIn.nextLine();
            
            int amtOfPts = fileIn.nextInt();
            fileIn.nextLine();

            String[] answersArr = new String[4];
            for (int j =0;j<4;j++){                 //Repeats to acquire all question answers
                answersArr[j] = fileIn.nextLine();

            }
            String correctAns = fileIn.nextLine();
            Question ques = new Question(amtOfPts, questionAsk, answersArr, correctAns);
            questions[i] = ques;

        }
    }


    /**
     * Method begins the game and prompts the question asking for their name and then attaching
     * the name to its instance. Briefly explains game rules to player.
     */
    public void startGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("*#* WELCOME TO MICHAEL'S TRIVIA *#*\nYou will earn points for every correct question!\nWhat is your name?");
        playerName = input.nextLine();
        System.out.println("Lets Start " + playerName + "! Please answer with the letter of your chosen answer!\nYou win points for every correct answer!\n");
    }


    /**
     * Method finishes the game by displaying the players final game stats and their
     * ultimate correct answer percentage. Also thanks player using their name for playing.
     */
    public void finishGame(){
        System.out.println("\n\nThank you for Playing! Here are your final stats:");
        System.out.println(statsToString());
        System.out.println("Correct Percent: " + (((double)(correct)/(double)(questionsDone)*100)+ "%"));
        System.out.println("Thank you again "+playerName+"! Have a great day!");
    }


    /**
     * File displays the next question to the player, marks the question as used (so it will not be repeated),
     * inputs the user's answer and checks if it is correct. Depending on the users answer it
     * updates the users stats and then displays them to the player.
     */
    public void getNextQuestion(){
        Scanner input = new Scanner(System.in);
        Question output = getRandomQuestion();           //Helper method gets a random question
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


    /**
     * Method returns the player's current game stats as a string
     * to be used after questions and at end of game.
     * @return String of players stats.
     */
    public String statsToString(){
        String output = "Total Correct: "+correct+"\nTotal Incorrect: "+wrong;
        output += "\nCurrent Streak: "+streak+"\nPoints Earned: "+pts;
        return output;
    }


    /**
     * Method uses math to generate a random question and pick a random question out of the array index
     * @return A random question from the array
     */
    public Question getRandomQuestion(){
        int randomNum = (int)(Math.random()*(numQuestions));
        return questions[randomNum];
    }





    //Getters and Setters

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

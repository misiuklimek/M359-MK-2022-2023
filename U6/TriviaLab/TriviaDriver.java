package U6.TriviaLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame testGame = new TriviaGame("triviaproject.txt");
        testGame.readQuestionFile();
        testGame.startGame();

        while (ifContinue){
            testGame.getNextQuestion();

            testGame.setQuestionsDone(testGame.getQuestionsDone()+1);
            if (testGame.getQuestionsDone() == (testGame.getNumQuestions())){
                ifContinue = false;
            } else{
                askToContinue();
            }
        }
        testGame.finishGame();




    }
    public static boolean ifContinue = true;
    public static void askToContinue(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWould you like to continue? (Y/N)");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")){
            ifContinue = true;
        } else{
            ifContinue = false;
        }
    }



}

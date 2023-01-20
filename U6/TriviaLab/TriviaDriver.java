package U6.TriviaLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {

    //Static Variables/Methods

    /**
     * Static variable holds if the user wants to continue playing or not
     */
    public static boolean ifContinue = true;




    public static void main(String[] args) throws FileNotFoundException {
        //starts new game and reads game file
        TriviaGame testGame = new TriviaGame("triviaproject.txt");
        testGame.readQuestionFile();
        testGame.startGame();


        // while loop allows game to continue asking questions till
        // the player is done or runs out of questions
        while (ifContinue){
            testGame.getNextQuestion();

            testGame.setQuestionsDone(testGame.getQuestionsDone()+1);
            if (testGame.getQuestionsDone() == (testGame.getNumQuestions())){       //checks if all questions are used
                ifContinue = false;
            } else{
                askToContinue();
            }
        }
        testGame.finishGame();




    }

    /**
     * Static method prompts the user on if they want to respond and changes the
     * ifContinue variable accordingly.
     */
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

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
        }




    }
    public static boolean ifContinue(){
        Scanner input = new Scanner()
    }
}

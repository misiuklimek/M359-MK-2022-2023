package U6.TriviaLab;

import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame testGame = new TriviaGame("triviaproject.txt");
        testGame.readQuestionFile();
        System.out.println(testGame.getNextQuestion());
    }
}

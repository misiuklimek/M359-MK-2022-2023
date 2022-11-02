package U4_Loops.PigLatinLab;

import java.util.Locale;

public class PigLatin {


    /**
     *  Checks the first letter of a string and returns true if it is a consonant and false
     *  if it is a vowel using an if statement.
     *
     * @param letter
     *      * @return
     */
    public static boolean ifConsonant(String letter){
        String firstChar = "";
        firstChar += letter.charAt(0);
        if (firstChar.equalsIgnoreCase("a") || firstChar.equalsIgnoreCase("i")
                || firstChar.equalsIgnoreCase("e") || firstChar.equalsIgnoreCase("o") || firstChar.equalsIgnoreCase("u")){
            return false;
        } else{
            return true;
        }
    }

    /**
     * Translates a single word (NO SPACES) into pig latin using an if statement and for loop.
     * @param word
     * @return
     */
    public static String translateWordToPigLatin(String word){
        String newWord = "";
        String temp = "";
        if (ifConsonant(word) != true){
            newWord += word.toLowerCase();
            newWord += "yay";
        } else {
            for (int i = word.length(); i > 0; i--) {       // for loop repeats to check letters for multiple consonants
                if (ifConsonant(word) == true) {
                    temp += word.charAt(0);
                    word = word.substring(1);
                } else {
                    newWord += word;
                    newWord += temp;
                    newWord += "ay";
                    return newWord.toLowerCase();
                }
            }
        }
        return newWord;
    }

    /**
     * Uses a for loop to translate each word of a sentence individually and an if statement in order to check
     * if it is the end of the sentence. Adds each translated word to new string in order to return fully
     * translated phrase.
     * @param phrase
     * @return
     */
    public static String toPigLatin(String phrase){
        String tempWord = "";
        String newPhrase = "";
        String tempPhrase = "";
        for (int i = wordCount(phrase); i > 0; i--){
            if (phrase.indexOf(" ") != -1) {
                tempWord = phrase.substring(0, phrase.indexOf(" "));
                newPhrase += translateWordToPigLatin(tempWord);
                phrase = phrase.substring(phrase.indexOf(" ")+1);       //Updates phrase to only keep
                newPhrase += " ";                                                // non-translated words
            } else{
                newPhrase += translateWordToPigLatin(phrase);
                tempPhrase = newPhrase.toUpperCase();
                newPhrase = tempPhrase.substring(0,1) + newPhrase.substring(1);
                return newPhrase;
            }
        }
        tempPhrase = newPhrase.toUpperCase();                                           // Capitalized the first
        newPhrase = tempPhrase.substring(0,1) + newPhrase.substring(1);       //  letter of string
        return newPhrase;
    }

    /**
     * Uses while loop to count the amount of spaces in a phrase in order to see how many words are included.
     * Returns an int with the number of words in the phrase/.
     * @param phrase
     * @return
     */
    public static int wordCount(String phrase){
        int wordCnt = 0;
        while (phrase.length() > 0){
            if (phrase.indexOf(" ") == -1){
                wordCnt++;
                return wordCnt;
            } else{
                wordCnt++;
                phrase = phrase.substring(phrase.indexOf(" ")+1);
            }
        }
        wordCnt++;
        return wordCnt;
    }

}

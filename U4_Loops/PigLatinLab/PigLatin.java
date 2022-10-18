package U4_Loops.PigLatinLab;

public class PigLatin {

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


    public static String translateWordToPigLatin(String word){
        String newWord = "";
        String temp = "";
        if (ifConsonant(word) != true){
            newWord += word;
            newWord += "yay";
        } else {
            for (int i = word.length(); i > 0; i--) {
                if (ifConsonant(word) == true) {
                    temp += word.charAt(0);
                    word = word.substring(1);
                } else {
                    newWord += word;
                    newWord += temp;
                    newWord += "ay";
                    return newWord;
                }
            }
        }
        return newWord;
    }

    public static String toPigLatin(String phrase){
        String tempWord = "";
        String tempPhrase = phrase;
        String newPhrase = "";
        for (int i = phrase.length(); i > 0; i--){
            if (tempPhrase.length() > 0){
                tempPhrase = phrase.substring(0,phrase.indexOf(" "));
                newPhrase += PigLatin.translateWordToPigLatin(tempPhrase) + " ";
                tempPhrase = tempPhrase.substring(tempPhrase.indexOf(" ")+1);
            } else{
                return newPhrase;
            }
        }
        return newPhrase;
    }


}

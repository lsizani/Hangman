package za.co.lsizani;

import java.util.Scanner;

/**
 * This is a HangMan App. To play this game, guess the concealed letters to reveal the word!
 * Created by Lunga Sizani on 2014/08/19.
 */
public class HangManApp {
    public static void main(String[] args){
        try {
            Dictionary dic = DictionaryLevelFactory.getDictionaryForLevel(Level.One);
            Scanner input = new Scanner(System.in);
            int index = (int)(Math.random() * 10);
            int maxGuesses = 4;
            String word = dic.getWordAtIndex(index);
            String guess = "";
            for(int i =0; i < dic.getWordLength(); ++i){
                guess += "_";
            }

            System.out.println("Start your guess, Enter a single char at a time");
            String c = input.next();

            while(c.trim().length() > 1){
                System.out.println("Please enter only a single char");
                c = input.next();
            }

            while(guess.contains("_") && maxGuesses > 0) {
                guess = dic.computeGuess(c, word, guess);
                if(guess.equalsIgnoreCase(word)){
                    System.out.println(guess + " -Game Won!");
                    break;
                }else{

                    if(!guess.contains(c)){
                        maxGuesses = maxGuesses - 1;
                    }
                }
                System.out.println(guess + " Guesses Left: " + maxGuesses);
                c = input.next();
            }
            if(maxGuesses <= 0) {
                System.out.println("Game Over - You're out of guesses. \n" + word);
            }

        }catch(InvalidLevelException e){
            System.out.println(e.getMessage());
        }
    }
}

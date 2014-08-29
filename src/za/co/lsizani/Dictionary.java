package za.co.lsizani;

import java.util.ArrayList;

/**
 * This abstract class is the base class for the level dictionaries.
 * All level dictionaries extend this class.
 * Created by Lunga Sizani on 2014/08/19.
 */
public abstract class Dictionary {
    protected final ArrayList<String> words = new ArrayList();

    public abstract ArrayList<String> getAllWords();

    public abstract void initWords();

    public abstract String getWordAtIndex(int index);

    public abstract int getWordLength();

    public String computeGuess(String ch, String word, String lastGuess){
        StringBuilder guess;
        if(lastGuess.matches("[abc]")) {
           guess = new StringBuilder("______");
        }
        else{
           guess = new StringBuilder(lastGuess);
        }
        if(!word.contains(ch)){
            return guess.toString();
        }
        else{
            for(int i = 0; i < word.length(); ++i){
                if(word.charAt(i) == ch.charAt(0)){
                    guess.setCharAt(i, ch.charAt(0));
                }
            }
            return guess.toString();
        }

    }
}

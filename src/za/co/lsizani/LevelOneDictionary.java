package za.co.lsizani;

import java.util.ArrayList;

/**
 * Created by LSizani on 2014/08/19.
 */
public final class LevelOneDictionary extends Dictionary {

    public LevelOneDictionary(){
        initWords();
    }

    @Override
    public ArrayList<String> getAllWords() {
        return words;
    }

    @Override
    public void initWords() {
        words.add("abacus");
        words.add("abroad");
        words.add("betray");
        words.add("better");
        words.add("chrome");
        words.add("chunky");
        words.add("demote");
        words.add("deploy");
        words.add("emblem");
        words.add("emerge");
    }

    @Override
    public String getWordAtIndex(int index) {
        return words.get(index);
    }

    @Override
    public int getWordLength(){
        return 6;
    }
}

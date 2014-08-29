package za.co.lsizani;

/**
 * Created by LSizani on 2014/08/19.
 */
public final class DictionaryLevelFactory {


    public static Dictionary getDictionaryForLevel(Level lv) throws InvalidLevelException{
        Level lvl = lv;
        switch (lvl){
            case One:
                return new LevelOneDictionary();
            case Two:
            case Three:
            case Four:
            case Five:
            default:
                throw new InvalidLevelException();

        }

    }
}

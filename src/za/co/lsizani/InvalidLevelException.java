package za.co.lsizani;

/**
 * This is an Exception Class thrown for an invalid or undefined level
 * Created by Lunga Sizani on 2014/08/19.
 */
public class InvalidLevelException extends Exception {

    public InvalidLevelException(){

    }

    @Override
    public String getMessage(){
        return "An invalid Level was passed in";
    }

}

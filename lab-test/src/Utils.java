import java.util.regex.Pattern;

public class Utils  {

    public static void checkPassword(String password) throws InvalidPasswordException {

        Pattern checkDigit = Pattern.compile("\\d");
        Pattern checkLetter = Pattern.compile("[a-z]|[A-Z]");

        if(password.length() < 8){
            throw new InvalidPasswordException("Password minimum lenght should be 7");
        }
        if (!checkDigit.matcher(password).find()) {
            throw new InvalidPasswordException("Password does not contain any digit");
        }
        if(!checkLetter.matcher(password).find()){
            throw new InvalidPasswordException("Password doest not contain any letter");
        }

    }
}

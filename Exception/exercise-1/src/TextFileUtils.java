
public class TextFileUtils {


    /**
     * @param text
     * @return text without whitespaces
     * @implSpec Remove whiteSpaces
     * Requires : A string of text
     * Modifies : removing all whitespaces from a string of text
     * Effects : All whitespaces remove while maintaining the end line
     *
     */
    static public String removeWhiteSpaces(String text){
        return text.replaceAll("\\s", "");
    }


}

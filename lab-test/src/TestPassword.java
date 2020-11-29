import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestPassword {

    public static void main(String[] args) throws IOException {

        Password test = new Password();
        boolean condition = true;
        while(condition){
        try {
            test.testPassword();
        } catch (IOException | InvalidPasswordException ioException) {
            ioException.printStackTrace();
            continue;
        }
        condition=false;
        }
        System.out.println("Your have enter correct format of password");


    }

}

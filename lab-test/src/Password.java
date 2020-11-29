import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {
    String password;

    public Password(String password) {
        this.password = password;
    }

    public Password() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void testPassword() throws IOException, InvalidPasswordException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Please key in your new password");
        password = bufferedReader.readLine();
        Utils.checkPassword(password);
    }
}

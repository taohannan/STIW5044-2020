import exception.UserException;
import utils.UserUtils;

public class TestException {

    public static void main(String[] args)  {

        int[] number =  {};
        try {
            int sum = UserUtils.sumArray(number);
            System.out.println(sum);
        } catch (UserException e) {
            e.printStackTrace();
        }

    }
}

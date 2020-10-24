import java.util.Arrays;

public class Utils {

    /**
     * @param a
     * @return sum of param a
     * @implSpec will check null pointer array
     * @requires not null array
     * @
     */
    public static int sum(int [] a) {

        int sum = Arrays.stream(a).sum();

        return sum;

    }

}

import java.util.Arrays;

public class Procedure {

    public static void main(String[] args) {

        int []  a = {2,3,4,61,2};
//        Arrays.stream(Arrays.stream(a).toArray()).boxed().forEach(System.out::print);
        System.out.println(Utils.sum(a));

    }
}

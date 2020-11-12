import java.util.Arrays;

public class assnMain {
    public static void main(String[] args) {
        int [] data = {2, 4, 6, 8};
        sum(data);
    }

    public static void sum(int[] num){
        if (num == null || num.length ==0)
            return;
        for (int j=1; j< num.length; j++) {
            num[j] = num[j - 1] + num[j];
            System.out.println("num[" + j + "] = " + num[j]);
            System.out.println("num.length =" + num.length);
            System.out.println(Arrays.toString(num));
        }
        System.out.println(Arrays.toString(num));

    }

}

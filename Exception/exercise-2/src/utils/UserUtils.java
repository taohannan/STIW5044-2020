package utils;

import exception.UserException;

import java.util.Arrays;

public class UserUtils {

    public static int sumArray(int [] numbers) throws UserException {

        int sum =0;
        if (numbers.length == 0) {
            throw new UserException("Empty Array");
        } else {
            for (int number : numbers) {
                sum = sum+ number;
            }

        }

       return sum;
    }

}

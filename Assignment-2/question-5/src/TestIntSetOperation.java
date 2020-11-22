import java.util.ArrayList;
import java.util.List;

public class TestIntSetOperation {

    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(8);
        integerList.add(10);
        integerList.add(5);
        integerList.add(6);
        integerList.add(5);
        integerList.add(8);
        integerList.add(1);

        IntSetOperation setOperation = new IntSetOperation(integerList);
        System.out.println("Size of the integerList = "+setOperation.size());
        System.out.println("Last Index of element valued 5 = "+setOperation.lastIndexOf(5));
        System.out.println("Sum of IntegerList = "+ setOperation.sums());
        System.out.println("Sum of multiplied value in IntegerList = "+ setOperation.multiply());
        System.out.println("Value of integerList at index no 7 is " + integerList.get(7));
        integerList.set(7,6);
        System.out.println("New Value of integerList at index no 7 is "+ integerList.get(7));
        integerList.clear();
        System.out.println("New Size of integerList after clear : " +setOperation.size());


    }

}

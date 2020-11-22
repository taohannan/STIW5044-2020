public class TestIntOperation {

    public static void main(String[] args) {

        IntOperation operation = new IntOperation();
        int num = 12;
        int number = 15;

        operation.setX(num);
        System.out.println("Adding Operation with "+number + " = "+operation.add(number));
        System.out.println("Multiply Operation with "+number + " = "+operation.multiply(number));
        System.out.println("Substract Operation with "+number + " = "+operation.substract(number));
        System.out.println("Float value " + " = "+operation.floatValue());
        System.out.println("Double value " + " = "+operation.doubleValue());
        System.out.println(operation.toString());

    }

}

public class OverloadTest {


    void method1(Object o, long x, long y) {
        System.out.println("definition 1");
    } //definition 1

    void method1(String s, int x, long y){
        System.out.println("definition 2");
    } //definition 2
    void method1(Object o, int x, long y){
        System.out.println("definition 3");
    } //definition 3
    void method1(String s, long x, long y) {
        System.out.println("definition 4");
    }//definition 4

}

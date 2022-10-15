package test;

public class InnerStaticTest {

    int number;

    public static void main(String[] args) {
        testtttMethod();
    }

    public static void testtttMethod() {
        System.out.println(InnerStaticClass.number);
//        System.out.println(innerStaticClass.number2);
        InnerStaticClass innerStaticClass = new InnerStaticClass();
        InnerStaticClass innerStaticClassCopy = new InnerStaticClass();

        int number2 = innerStaticClass.number2;
        System.out.println("number2 = " + number2);

        innerStaticClassCopy.number2 = 333;
        System.out.println("number2 = " + number2);

    }

    static class InnerStaticClass {
        static int number = 3;
        int number2 = 4;

        void testMethod() {
            System.out.println("test");
        }
    }

}

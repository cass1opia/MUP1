package Vorlesung;

public class Exception {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Message: " + arithmeticException.getMessage());
            System.out.println("toString: " + arithmeticException.getMessage());
            System.out.println("StackTrace: ");
            System.err.flush();
            System.out.println("Message:" + arithmeticException.getMessage());
            System.out.println("Normal Error: " + arithmeticException.getStackTrace());
        }
        }
}


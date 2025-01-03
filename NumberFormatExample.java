package ExceptionHandling;

public class NumberFormatExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Throws NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
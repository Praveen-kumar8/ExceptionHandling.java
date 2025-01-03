package ExceptionHandling;

public class ClassCastExample {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Throws ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}
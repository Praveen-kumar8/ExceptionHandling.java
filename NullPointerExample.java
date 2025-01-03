package ExceptionHandling;

public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String str = null;
            str.length(); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
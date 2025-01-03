package ExceptionHandling;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt"); // Throws IOException
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
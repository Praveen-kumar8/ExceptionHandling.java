package ExceptionHandling;

public class ArrayIndexE {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3};
            int value=arr[5];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array problem"+e.getMessage());
        }
    }
}

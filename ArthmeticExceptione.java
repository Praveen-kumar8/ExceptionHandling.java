package ExceptionHandling;

public class ArthmeticExceptione {
   public static void main(String[] args) {
    try{
        int result=10/0;
   }catch(ArithmeticException e){
   System.out.println("Connot divide by Zero! "+e.getMessage());
   }
   finally{
    System.out.println("This code will execute");
   }
   } 
}

//universal catch block
import java.util.*;
public class Demo4{
   public static void main(String[] args)
   {
      Scanner sc= new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter 2 numers");
      try{
      a = sc.nextInt();
      b = sc.nextInt();
       c=a/b;
        System.out.println("Division is"+c);
        }
       
        catch(Exception e)
        {
           if(e instanceof ArithmeticException )
           {
         System.out.println("can not divide by zero!!");
        
         }else if(e instanceof InputMismatchException )
         {
         System.out.println("plz enter int value!!");
         }
         }
         
      System.out.println("end");
      }
      }
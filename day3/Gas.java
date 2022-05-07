
import java.util.*;

 class Gas {
  public static void main(String[] args){
  Scanner ob = new Scanner(System.in);
  System.out.println("Tank capacity: ");
        int capacity = ob.nextInt();
        System.out.println("Gage reading: ");
        double read= ob.nextDouble();
        System.out.println("Miles per gallon: ");
        int miles = ob.nextInt();
        double distance = (capacity*(read/100))*miles;
        
        if(distance<200)
        {
         System.out.println("Get Gas!!");
        }
        else
        {
            System.out.println("Safe to Proceed !!");
        }
        }
        }
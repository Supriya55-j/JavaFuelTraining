
import java.util.*;
public class Pie {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your weigth in pounds : ");
        int weight = ob.nextInt();
        if(weight>=100 && weight<=250){
            System.out.println("Contestent is allowed in the contest !!");
        }else{
            System.out.println("Contestent is not allowed in the contest !!");
        }
    }
}
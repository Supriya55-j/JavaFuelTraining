 import java.util.*;
 class TownDump
{
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        double weight,Charge=0;
        int i,j;
        System.out.println("Enter the weight of a load trash in pound : ");
        weight=sc.nextDouble();
        if(weight==0 && weight<=200)
        {
           Charge=20;
            System.out.println("Charges :"+Charge);
        }


        else if (weight>200 && weight<=400)
        {
            if(weight-200<=100)
            {
                Charge=28;
                System.out.println("Charges :"+Charge);
            }
            else
            {
                Charge=36;
                System.out.println("Charges :"+Charge);
            }

        }
        else
        {
            System.out.println("Capacity Full");
        }
    }

}
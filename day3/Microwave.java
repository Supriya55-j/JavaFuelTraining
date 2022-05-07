/*Write a program that asks the user for the number of bolts, nuts, and washers in their purchase 
and then calculates and prints out the total. As an added feature, the program checks the order. A 
correct order must have at least as many nuts as bolts and at least twice as many washers as blots, 
otherwise the order has an error.*/


import java.util.Scanner;
 class Microwave
{
    public static void main(String[] args){
        int temp = 0;
        Scanner ob = new Scanner(System.in);
        System.out.println("How many items to heat : ");
        int item = ob.nextInt();
        System.out.println("Time for one item : ");
        int time = ob.nextInt();

        if(item==2){
            double delay =(double) time/2;
            time +=delay;
        }
        if(item==3){
         time = time*2;
        }
        if(item>3){
            System.out.println("Cannot start heating");
        }
        if(time>=100){
            temp = time%100;
            time = time/100;
            //    System.out.println(temp);
        }else{
            temp = time;
            time = 0;
        }
        System.out.println("Heat for " + time + " minutes " + temp + " seconds");
    }

}


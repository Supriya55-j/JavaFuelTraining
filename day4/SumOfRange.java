//Write a program that asks the user for two integers, low and high and then sums all the integers 
(inclusive) low through N. 

import java.util.*;
class SumOfRange
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out .println("enter 2 no ");
int a=sc.nextInt();
int z=sc.nextInt();
int i,sum=0;
for(i=a;i<=z; i=i+1)
{ 
sum=sum+i;
}
System.out.println(sum );

}
}
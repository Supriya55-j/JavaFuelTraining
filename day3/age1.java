import java.util.*;
import java.lang.*;

class age1
{

public static void main(String args[])
{
int age ;
Scanner sc=new Scanner(System.in);
System.out.println("enter the year of birth:");

int b=sc.nextInt();
System.out.println("enter the current year:");

int c =sc.nextInt();

if(c<b)
{
   age = (c+100)-b;
   if(age>=100){
      age=100-age;
   }

 System.out.println("current age is:"+age);

}else if(c>b){
   age = c-b;
   if(age>=100){
       age = 100-age;
       }
 System.out.println("Current age is" +age);
}

}
}

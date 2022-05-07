 //Write program to find Armstrong numbers between 1 to n


import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int num,temp,r=0,n=0 ,result;
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
System.out.println("Enter no" );
num=temp;
for(num!=0; num/10;n++)
{
num=temp;
}
for(num!=0; num/=10;)
{r=num%10;
result+=Math.Pow(r,n);
}
if(result==num)
{

System.out.println("is an armstrong no" +num );
}
else
{
System.out.println("is not an armstrong no" +num );


}
}

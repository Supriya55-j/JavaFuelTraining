 //power program


import java.util.*;
class power
{
public static void main(String args[])
{
int num,a,r=0,n=0;
Scanner sc= new Scanner(System.in);
int r=1;

System.out.println("Enter no" );
int a=sc.nextInt();

System.out.println("Enter no power" );
int b=sc.nextInt();

for( int i=1; i<=b ;i++)
{
r=a*r;
}

System.out.println("power" +r );

}
}

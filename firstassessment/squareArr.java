import java.util.*;
class squareArr
{
public static void main(String []args)
{
System.out.println("enter elements");
Scanner sc=new Scanner(System.in);

int arr[]=new int[5];
int arrsq[]=new int[5];

for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
arrsq[i]=arr[i]*arr[i];
}

for(int i=0;i<5;i++)
{
System.out.println(" "+arrsq[i]+" ");
}
}
}
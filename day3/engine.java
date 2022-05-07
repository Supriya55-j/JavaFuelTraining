import java.util.*;
class engine
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out .println("enter  2 temp ");
double tair,tsteam,eff;
tair=sc.nextDouble();
tsteam=sc.nextDouble();
if(tsteam>=373 && tair!= tsteam )
{
eff=1-(tair/tsteam);
System.out .println("max efficiency "+eff);
}
else{
}
}
}

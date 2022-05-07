import java.util.*;
class vowels
{
public static void main(String args[])
{
String s1;
char ch;
Scanner sc=new Scanner(System.in);
System.out .println("enter  charecter ");
s1=sc.next();
ch=s1.charAt(0);

if(ch=='a'|| ch=='e'||ch=='o'||ch=='i'||ch=='u' )
{
System.out .println("charecter is vowel  ");
}
else{
System.out .println(" charecter is consonant");
}
}
}

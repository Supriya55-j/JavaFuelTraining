//ArrayList class
import java.util.*;
public  class Demo8f
{
public static void main(String[]args)
{
//create arraylist object
ArrayList<String>ar;
ar=new ArrayList<>();
//check size of ArrayList
System.out.println(ar.size());
//add item in arraylist
ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");
ar.add("E");
System.out.println(ar.get(0));
//System.out.println(ar.size());
//add item at specific index
ar.add(1,"x");
System.out.println("By using for loop.....");
for(int i=0;i<ar.size();i++)
{
System.out.println(ar.get(i));
}
System.out.println("By using for each loop");
for(String s:ar)
{
 }



}
}
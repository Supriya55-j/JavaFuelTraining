

 class integer8
{
public static void main(String[]args) throws InvalidAgeException
  {
   String name=args[0];
   int age=Integer.parseInt(args[1]);
   if(age<18||age>=60)
 
   throw e;
   System.out.println("name"+name+"age"+age);
   }
  
}
public class InvalidAgeException extends Exception
{
public class InvalidAgeException()
{
 super();
 System.out.println("invalid age");
}
}
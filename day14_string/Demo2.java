//unchecked exception
import java.io.FileInputStream;
import java.io.FileNotInputStream;

class Demo2
{
  static void fun1()throws FileNotFoundException
  {
   try {
   FileInputStream fin;
   fin=new FileInputStream("c:/demo2/data.txt");
   }catch (FileFoundException e)
   {
     throw e;
     }
  }
  
  public static void main(String[] args)
  {
    fun1();
    }
  } 
   
   
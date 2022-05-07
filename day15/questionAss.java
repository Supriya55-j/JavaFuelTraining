/*WAp to write the content of file and calculate how many words present in that file*/
import java.io.*;
public class questionAss{
   public static void main(String[] args)throws Exception
   {
     FileInputStream fin;
     fin=new FileInputStream("C:\\Users\\CIVIL LAB\\Desktop\\java_training_alP\\day15_21april\\test1.txt");
     StringBuffer sb;
     sb=new StringBuffer();
     
      int x;
      System.out.println(fin.available());
      do{
          x=fin.read();
          if(x!=-1){
          sb.append((char)x);
          }
          }
          while(x!=-1);
          System.out.println(sb.toString());
          fin.close();
          System.out.println();
      }
     }
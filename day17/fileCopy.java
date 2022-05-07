//WAP to copy the content of one file to another by using CHAR IO classes.

import java.io.*;
public class fileCopy
{
   public static void main(String[]args)throws Exception
   {
      FileInputStream Fr=new FileInputStream("C:\\Users\\CIVIL LAB\\Desktop\\original.txt");
       FileOutputStream Fw=new FileOutputStream("C:\\Users\\CIVIL LAB\\Desktop\\blank.txt");
       System.out.println("File is Copied");
       int c;
       while((c=Fr.read())!=-1)
       Fw.write((char)c);
       Fr.close();
       Fw.close();
    }
}
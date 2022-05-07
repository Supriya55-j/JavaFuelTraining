//Buffer IO
import java.io.*;
public class Demo{
public static void main(String[] args){
    FileInputStream fin;
    fin=new FileInputStream bin("C:\\Users\\CIVIL LAB\\Desktop\\test1.txt");
    
    BufferedInputStream bin;
    bin=new BufferedInputStream(fin);
    
    FileOutStream fout;
    fout=new FileOutputStream("C:\\Users\\CIVIL LAB\\Desktop\\test1.txt");
    BufferedOutputStream bout;
    bout=new BufferedOutputStream(fout);
    int x;
    System.out.println(fin.available("C:\\Users\\CIVIL LAB\\Desktop\\test1.txt"));
    do{
      x=bin.read();
      if(!=-1){
        bout.write(x);
        }
  }  while(x!=-1);
     bin.close();
     bout.close();
     System.out.println("File Copied");
     }
 }
package com.example.demoweb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
   private Student stud;
   
   @Autowired
   public StudentDetails(Student stud)
   {
	   this.stud=stud;
	   
   }
   void setdata()
   {
	   System.out.println(4100);
	   System.out.println("xtyabc");
   }
   void showdata()
   {
	   System.out.println(stud.getId());
	   System.out.println(stud.getName());
   }
}













/*===================
 package com.example.demoweb2;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
   private Student stud;
   
   @Autowired
   public StudentDetails(Student stud)
   {
	   this.stud=stud;
	   
   }
   void setdata()
   {
	   System.out.println(100);
	   System.out.println("abc");
   }
   void showdata()
   {
	   System.out.println(stud.getId());
	   System.out.println(stud.getName());
   }
}
*/
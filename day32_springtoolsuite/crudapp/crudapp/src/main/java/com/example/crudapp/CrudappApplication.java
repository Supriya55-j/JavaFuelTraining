


package com.example.crudapp;
import java.util.List;
import java.util.Optional;

//import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CrudappApplication
{

	public static void main(String[] args) 
	{
		ApplicationContext context;
		context = SpringApplication.run(CrudappApplication.class, args);
		StudentRepository stud;
		
		stud=context.getBean(StudentRepository.class);
		//insert 
		Student st1=new Student(35,"ghj");
		stud.save(st1);
		System.out.println("record save");
		
		//update
		Optional<Student> op;
		op=stud.findById(900);
		Student st2=op.get();
		System.out.println(st2.getId());
	System.out.println(st2.getName());
	st2.setName("demo123");
     stud.save(st2);
 	System.out.println("record update");
/*	
	
	//delete
		Optional<Student> op1;
		op1=stud.findById(300);
		//Student st3=op1.get();
		Student st3=op1.get();
		stud.delete(st2);
	System.out.println("record deleted ");*/

	//delete
	Optional<Student> op1;
	op1=stud.findById(900);
	//Student st3=op1.get();
	Student st3=op1.get();
	stud.delete(st2);
System.out.println("record deleted ");

	List<Student>studlist;	
	studlist = stud.findAll();
	for(Student st:studlist)
		{
			System.out.println(st.getId()+" "+st.getName());
					
		}/*
	List<Student>studlist;	
	studlist = stud.findAll();
	for(Student st:studlist)
		{
			System.out.println(st.getId());
			System.out.println(st.getName());
				}*/
	}
}	

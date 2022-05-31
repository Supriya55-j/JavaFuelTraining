package com.example.demohttpmethods1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

@Autowired
private EmployeeRepository emp;
/*
@GetMapping("/employees")
public List<Employee> getAllStudents()
{
	return emp.findAll;
}


@GetMapping("/employee/{id}")
public Employee getEmployeeById(@PathVariable("id") Integer empId)
{

Optional<Employee> op = emp.findById(empId);
Employee c=op.get();
return c;
}

@PostMapping("/save")
public Employee createEmployee(@RequestBody Employee c)
{

	return emp.save(c);
}
}


@PutMapping("/updateemp/{id}")
public boolean updateEmployee(@PathVariable (value="id")Integer empId,@RequestBody Employee empDetails) throws Exception
{
boolean f=true;
try {
	Optional<Employee> op=emp.findById(empId);
	Employee c=op.get();
	c.setName(empDetails.getName());
	final Employee updateemp=emp.save(c);
}
catch(Exception e)
{
	f=false;
	}
return f;
}
}
*/

@DeleteMapping("/deletestud/{id}")
public boolean deleteEmployee(@PathVariable(value="id")Integer empId,@RequestBody Employee studDetails) throws Exception
{
	Optional<Employee> op=emp.findById(empId);
	Employee c=op.get();
	
	emp.delete(c);
	return true;
}

}


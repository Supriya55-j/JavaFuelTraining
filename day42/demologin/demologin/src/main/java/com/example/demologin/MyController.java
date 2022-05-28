package com.example.demologin;
//import com.example.demologin.UsersRepository;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
	public class MyController {

		@Autowired
		UsersRepository userrepo;
		@PostMapping("/registeruser")
		public String registerUser(@ModelAttribute Users users)
		{
			userrepo.save(users);
			return "index";
		}
		
		@GetMapping("/check")
		public String loginUser(@ModelAttribute Users users)
		{
			String path="invalid";
			List<Users>list1=userrepo.findAll();
			String pass=users.getPass();
			for(Users ob : list1)
			{
				Object uname = null;
				if(ob.getUname().equals(uname)&&ob.getPass().equals(pass))
				{
					path="result";
					break;
				}
			}
		    return path;
		}
	@GetMapping("/newuser")
	public String goToRegister()
	{
		
		return "result";
	}
	}



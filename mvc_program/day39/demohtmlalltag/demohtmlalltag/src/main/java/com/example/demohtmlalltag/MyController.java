
package com.example.demohtmlalltag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MyController {
  @GetMapping("/sayhello")
  public String gretting(@RequestParam(name="name",required=false,defaultValue="DIEMS")String fname,Model model)
  {
	model.addAttribute("name",fname);
//	model.addAttribute("pass",upass);
	return "hello";
	
  
  }
  }
//take input password, username,ok submit button html program.
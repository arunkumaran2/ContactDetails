package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexcontroller {

	@GetMapping("/givecontact")
	public ModelAndView display() //localhost:8080/givecontact
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.jsp");
	    return mav;
	}
	
	@GetMapping("/contact")
	public ModelAndView Con_no(Contact giveno)
	{
		String Name = giveno.getName();
		long Mobile_Number = giveno.getMobile_Number();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("chagre", Name);
		mav.addObject("charge1", Mobile_Number);
		
		if (String.valueOf(Mobile_Number).length() == 10)
		{
			//System.out.println("Successfully accept your details ");
		    mav.addObject("chagre2", "Successfully accept your details ");
		}
		else
		{
			//System.out.println("Your details to check pls ");
			mav.addObject("chagre3", "Your details to check pls ");
		}
		mav.setViewName("output.jsp");
		return mav;
	}
}

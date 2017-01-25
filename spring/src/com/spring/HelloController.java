package com.spring;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




import com.spring.Bean.LoginBean;

@Controller
public class HelloController {
	
	@RequestMapping(value="/login",method =RequestMethod.GET)
	public String init(Model model)
	{
		model.addAttribute("msg", "welcome to spring framework");
		return"login";
		
	}
	
	public String execute()
	{
		return "login";
	}
	@RequestMapping(method =RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) 
	
	{
		if (loginBean != null && loginBean.getUsername() != null & loginBean.getPassword() != null)
		{
			DB_Connection db_C=new DB_Connection();
			String login =db_C.login(loginBean.getUsername(),loginBean.getPassword());
			if(login=="success")
			{
				return"success";
			}
			else
			{
				model.addAttribute("error", "Please enter Details");
				return "login";
			}
			
		}
		else
		{
			System.out.println(loginBean.getUsername());
		model.addAttribute("error", "Please enter Details");
		return "login";
		}
		
		
	}
	

}

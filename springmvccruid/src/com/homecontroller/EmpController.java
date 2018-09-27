package com.homecontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empdao.EmpDao;
import com.pojo.Emp;

@Controller
public class EmpController {

	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empform")
	public ModelAndView showform(){
		return new ModelAndView("empform" , "command" , new Emp());
	}
	
	@RequestMapping(value="/save" , method =RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp")Emp emp){
		dao.save(emp);
		return new ModelAndView("redirect:/viewemp.html");
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		List<Emp> ll =dao.getallemp();
		return new ModelAndView("viewemp","list",ll);
		
	}
	
	@RequestMapping("/editemp/{id}")
	public ModelAndView editemp(@PathVariable int id){
		System.out.println("Value: "+ id);
		Emp e =dao.getempbyid(id);
		return new ModelAndView("editform","command",e);
		
	}
	
	 /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("emp") Emp emp){  
        System.out.println("inside controller");
    	dao.update(emp);  
        return new ModelAndView("redirect:/viewemp.html");  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable int id){  
        dao.delete(id);  
        return new ModelAndView("redirect:/viewemp");  
    }  
 
}

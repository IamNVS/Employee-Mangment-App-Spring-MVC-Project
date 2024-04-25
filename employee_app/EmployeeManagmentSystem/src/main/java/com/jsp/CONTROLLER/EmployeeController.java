package com.jsp.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDao;
import com.jsp.DTO.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	
	//insert employee details
	
	@RequestMapping("/insert")
	public ModelAndView getEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("create.jsp");
		return mv;
	}	
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		dao.saveEmployee(employee);
		ModelAndView v  = new ModelAndView();
		v.setViewName("index.jsp");
		return v;
		
	}
	
	// get Employee details by id
	
	@RequestMapping("/search")
	public ModelAndView searchEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("get.jsp");
		return mv;
	}
	@RequestMapping("/display")
	public ModelAndView getEmployeeById(@ModelAttribute Employee employee) {
		Employee emp = dao.getEmployeeById(employee.getId());
		ModelAndView v  = new ModelAndView();
		v.setViewName("display.jsp");
		v.addObject("employee",emp);
		return v;	
	}
	
	//delete employee by id
	
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("delete.jsp");
		return mv;
	} 
	@RequestMapping("/remove")
	public ModelAndView deleteEmployeeById(@ModelAttribute Employee employee) {
		 dao.deleteEmployee(employee.getId());
		ModelAndView v  = new ModelAndView();
		v.setViewName("remove.jsp");
		return v;
		
	}
	
	
	// Display all employee details
	
	@RequestMapping("/displayAll")
	public ModelAndView getAllEmployee() {
		ModelAndView mv = new ModelAndView();
		List<Employee> employees = dao.getAllEmployee();
		mv.addObject("employeelist",employees);
		mv.setViewName("displayAll.jsp");
		return mv;
	}
	
	// update employee details
	
	@RequestMapping("/update")
	public ModelAndView updateEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("update.jsp");
		return mv;
		
	}
	@RequestMapping("/updateEmp")
	public ModelAndView updateEmployeeById(@ModelAttribute Employee employee) {
		 dao.updateEmployee(employee);
		ModelAndView v  = new ModelAndView();
		v.setViewName("index.jsp");
		return v;
		
	}
	
	

}

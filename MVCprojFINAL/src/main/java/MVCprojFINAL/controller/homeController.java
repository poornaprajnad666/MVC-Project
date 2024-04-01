package MVCprojFINAL.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import MVCprojFINAL.empDao.employeeDao;
import MVCprojFINAL.model.Employee;

@Controller
public class homeController {
	
	@Autowired
	private employeeDao EmployeeDao;
	
	
	@RequestMapping("/")
	public String home(Model m) {
		
		List<Employee> emps =  EmployeeDao.getEmployee();
		m.addAttribute("employees",emps);
		System.out.println(emps);
		return "index";
	}
		
		
	@RequestMapping("/addEmp")
	public String addEmp() {
		System.out.println("this is home url");
		return "addEmp";
	}
	
	@RequestMapping(value="/handle-employee", method = RequestMethod.POST)
	public RedirectView handleEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee);
		this.EmployeeDao.createEmp(employee);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("./");
		return redirectView;
	}
	
	@RequestMapping("/delete/${eid}")
	public RedirectView deleteEmployee(@PathVariable("eid") int eid, HttpServletRequest request) {
		this.EmployeeDao.delEmp(eid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}
	
	
	@RequestMapping("/get-employee/${eid}")
	public void getEmployeeById( int eid, HttpServletRequest request) {
		Employee empById = EmployeeDao.getSingleEmp(eid);
		request.setAttribute("empbyid", empById);

		
	}
	
	
}

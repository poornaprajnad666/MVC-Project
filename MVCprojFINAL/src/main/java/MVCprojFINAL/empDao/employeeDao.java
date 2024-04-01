package MVCprojFINAL.empDao;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import MVCprojFINAL.model.Employee;

@Component
public class employeeDao {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void createEmp(Employee employee) {
		
		this.hibernateTemplate.save(employee);
	}
	
//	get all emp
	public List<Employee> getEmployee(){
		List<Employee> emply = this.hibernateTemplate.loadAll(Employee.class);
		return emply;
	}
	
//		delete
	@Transactional
	public void delEmp(int eid) {
		Employee e = this.hibernateTemplate.load(Employee.class, eid);
		this.hibernateTemplate.delete(e);
	}
	
//		get single employee
	public Employee getSingleEmp(int eid) {
		return this.hibernateTemplate.get(Employee.class, eid);
	}
	
}

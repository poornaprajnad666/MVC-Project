package MVCprojFINAL.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="my_ding_dong_tbl")
public class Employee {
	
	@Id
//	@GeneratedValue(strategy =GenerationType.AUTO)
	private int eid;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", department=" + department + ", location=" + location + ", name=" + name 
				+ ", getEid()=" + getEid() +  ", getDepartment()=" + getDepartment()
				+ ", getLocation()=" + getLocation() +", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, String department, String location) {
		super();
		this.eid = eid;
		
		this.department = department;
		this.location = location;
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private String department;
	private String location;
	private String name;
}

package Entity;
// Generated Mar 4, 2024, 10:11:08 AM by Hibernate Tools 6.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private int deptId;
	private String deptName;
	private String deptNo;
	private String location;
	private Set employees = new HashSet(0);

	public Department() {
	}
	
	public Department(int deptId, String deptName, String deptNo, String location) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.location = location;
	}
	public Department(int deptId, String deptName, String deptNo, String location, Set employees) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.location = location;
		this.employees = employees;
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}
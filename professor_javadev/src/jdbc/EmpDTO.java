package jdbc;

import java.io.Serializable;

public class EmpDTO implements Serializable {
	private String last_name;
	private String department_name;
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	@Override
	public String toString() {
		return last_name + "\t" + department_name;
	}
}

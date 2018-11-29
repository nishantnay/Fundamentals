package comparatorInterfaces;

public class Employee implements Comparable<Employee>{

	private String empName;
	private String empDesignation;
	private double empSalary;
	
	public Employee(String name, String designation, double salary){
		setEmpName(name);
		setEmpDesignation(designation);
		setEmpSalary(salary);
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}

	
	
}

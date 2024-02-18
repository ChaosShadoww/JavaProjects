
public class Employee {
	private String employeeID;
	private String name;
	private String department;
	private double salary;
	private String designation;
	
	public Employee() {
		this("No ID","No Name", "No Department", 0.0, "No Designation");
	}
	public Employee(String employeeID, String name, String department, double salary, String designation) {
		setEmployeeID(employeeID);
		setName(name);
		setDepartment(department);
		setSalary(salary);
		setDesignation(designation);
	}
	
	public double addBonus() {
		return 0.0;
	}
	public double deductions() {
		return 0;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		if(employeeID == null) {
			System.out.println("Invalid ID");
			System.exit(0);
		}
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String toString() {
		return "Employee ID: " + getEmployeeID() + "\n" +
				"Employee name: " + getName() + "\n" +
				"Department name: " + getDepartment() + "\n" +
				"Salary: " + getSalary() + "\n" +
				"Designation: " + getDesignation() + "\n";
				
	}

}

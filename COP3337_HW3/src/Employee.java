
public class Employee {
	private String name;
	private Date hireDate;
	public Employee() {
		// name = "No name";
		// hireDate = new Date();
		this("No name", new Date());
	}
	public Employee(String name, Date hireDate) {
		setName(name);
		setHireDate(hireDate);
	}
	public Employee(Employee otherEmployee) {
		if(otherEmployee == null) {
			System.out.println("Error creating Employee");
			System.exit(0);
		}
		this.name = otherEmployee.name;
		this.hireDate = new Date(otherEmployee.hireDate);
	}
	public void setName(String name) {
		if(name == null) {
			System.out.println("Invalid name");
			System.exit(0);
		}
		this.name = name;
	}
	public void setHireDate(Date hireDate) {
		if(hireDate == null) {
			System.out.println("Invalid hiring date");
			System.exit(0);
		}
		this.hireDate = new Date(hireDate);
	}
	public String getName() {
		return name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public String toString() {
		return getName() + " was hired on " + getHireDate();
	}
	public boolean equals(Employee otherEmployee) {
		return (getName().equals(otherEmployee.getName()) &&
				getHireDate().equals(otherEmployee.getHireDate()));
	}
}

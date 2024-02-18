
public class Doctor extends SalariedEmployee{
	private String specialty;
	private double officeVisitFee;
	
	
	public Doctor() {
		super();
		specialty = "No Specialty";
		officeVisitFee = 0.0;
		
	}
	public Doctor(String name, Date hireDate, double salary, String specialty, double officeVisitFee) {
		super(name, hireDate, salary);
		setSpecialty(specialty);
		setOfficeVisitFee(officeVisitFee);
	}
	
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		if(specialty == null) {
			System.out.println("Invalid specialty");
			System.exit(0);
		}
		this.specialty = specialty;
	}
	public double getOfficeVisitFee() {
		return officeVisitFee;
	}
	public void setOfficeVisitFee(double officeVisitFee) {
		if(officeVisitFee < 0) {
			System.out.println("Invalid Amount");
			System.exit(0);
		}
		else {
		this.officeVisitFee = officeVisitFee;
		}
	}
	public String toString() {
		return "The doctor " + getName() + " was hired on " + getHireDate() + " at Salary $" + getSalary() + "\n" +
		 "The speciality is " + getSpecialty() + " and visit fee is $" + getOfficeVisitFee();
	}
	public String toString2() {
		return "Primary Doctor is: " + getName();
	}
	

}


public class Manager extends Employee{
	private int deductions;
	private int days;
	
	public Manager() {
		super();
	}
	public Manager(String employeeID, String name, String department, double salary, String designation) {
		super(employeeID,  name,  department,  salary, designation);
	}
	public Manager(Manager manage, int days) {
		setDays(days);
	}
	public double addBonus() {
		 return 300;
	}
	
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int absent(int days) {
		int absent = 20 - days;
		return absent;
	}
	
	public int deductions(int days) {
		if(days < 20) {
			int absent = 20 - days;
			int deduction = ((int)super.getSalary())/20;
			return deduction * absent ;
		}
		else if(days == 20) {
			return 0;	
		}
		else {
			return 0;
		}

		  
	}
	public String display() {
		double newSalary = super.getSalary() + addBonus();
		return super.toString() + "\n" +
			   "Salary after adding the bonus is " + newSalary;	
	}
	

}


public class Patient extends Person{
	private Doctor primaryPhysician;
	
	public Patient() {
		super();
		this.primaryPhysician = null;
		
	}
	
	public Patient(Person name, Doctor primaryPhysician) {
		super(name);
		setPrimaryPhysician(primaryPhysician);
		
	}
	public Patient(Patient otherPatient) {
		super(otherPatient);
	}
	
	
	public Doctor getPrimaryPhysician() {
		return primaryPhysician;
	}

	public void setPrimaryPhysician(Doctor primaryPhysician) {
		if(primaryPhysician == null) {
			System.out.println("Invalid Physician");
			System.exit(0);
		}
		this.primaryPhysician = primaryPhysician;
	}

	public String toString() {
		return super.toString();
		 
		
	}
	public boolean equals(Patient otherPatient){
		return getName().equals(otherPatient.getName());
	}
	

}

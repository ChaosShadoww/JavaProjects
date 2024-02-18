
public class Billing {
	
	
	private Patient pat;
	private Doctor doc;
	double amountDue;
	
	public Billing() {
		this.pat = pat;
		this.doc = doc;
		this.amountDue = 0.0;
	}
	
	public Billing(Patient pat, Doctor doc, double amountDue) {
		setPat(pat);
		setDoc(doc);
		setAmountDue(amountDue);
		
	}
	public Billing(Billing otherBilling) {
		setAmountDue(amountDue);
	}
	
	public Patient getPat() {
		return pat;
	}
	public void setPat(Patient pat) {
		
		this.pat = pat;
	}
	
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = doc.getOfficeVisitFee();
	}
	
	
	
	public String toString() {
		return "Patient: " + pat.getName() + "\n" +
				"Doctor: " + doc.getName() + "\n" +
				"Amount Due: $" + getAmountDue();
	}
	public boolean equals(Billing otherBilling){
		return getAmountDue() == otherBilling.getAmountDue();
	}

	

}

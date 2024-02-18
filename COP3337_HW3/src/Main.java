import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double totalBilling;
		Doctor d1 = new Doctor("Bob",new Date(12,5,2011) ,80000, "Pediatrist", 10.5);
		Doctor d2 = new Doctor("Susan",new Date(12,10,2011) ,95000, "Surgeon", 150.5);
		Doctor d3 = new Doctor("Lily",new Date(12,15,2011),75000, "Kidney", 95.5);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("");
		
		System.out.println("*Patient's Information*");
		Person per1 = new Person("Fred");
		Patient pa1 = new Patient(per1, d1);
		System.out.println(pa1 + ", " + d1.toString2());
		Person per2 = new Person("Sally");
		Patient pa2 = new Patient(per2, d2);
		System.out.println(pa2 + ", " + d2.toString2());
		Person per3 = new Person("John");
		Patient pa3 = new Patient(per3, d3);
		System.out.println(pa3 + ", " + d3.toString2());
		System.out.println("");
		
		System.out.println("*Billings's Information*");
		Billing b1 = new Billing(pa1, d1, 0);
		System.out.println(b1);
		Billing b2 = new Billing(pa2, d2, 0);
		System.out.println(b2);
		Billing b3 = new Billing(pa3, d3, 0);
		System.out.println(b3);
		
		totalBilling = b1.getAmountDue() + b2.getAmountDue() + b3.getAmountDue();
		System.out.println("");
		System.out.println("The total income from the billing records is: $" + totalBilling);



	}

}

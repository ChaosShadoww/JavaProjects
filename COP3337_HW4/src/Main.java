import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Manager m1 = new Manager("E001","Mark","HR",15000.0,"Manager");
		System.out.println(m1);
		Manager m2 = new Manager("E012","Peter","R&D",20000.0,"Manager");
		System.out.println(m2.toString());
		Clerk c1 = new Clerk("E056","Samual","Accounts",12000.0,"Clerk");
		System.out.println(c1.toString());
		Clerk c2 = new Clerk("E089","John","Asset Protection",14000.0,"Clerk");
		
		System.out.println(m1.getName() + " and " + c1.getName() + " have different Designations \n");
		
		System.out.println("Enter the number of days Employee " + m1.getEmployeeID() + " is Present out of 20: ");
		int m1Days = scan.nextInt();
		Manager m1_1 = new Manager(m1, m1Days);
		System.out.println("Enter the number of days Employee " + m2.getEmployeeID() + " is Present out of 20: ");
		int m2Days = scan.nextInt();
		Manager m2_2 = new Manager(m2, m2Days);
		System.out.println("Enter the number of days Employee " + c1.getEmployeeID() + " is Present out of 20: ");
		int c1Days = scan.nextInt();
		Clerk c1_1 = new Clerk(c1, c1Days);
		System.out.println("Enter the number of days Employee " + c2.getEmployeeID() + " is Present out of 20: ");
		int c2Days = scan.nextInt();
		Clerk c2_2 = new Clerk(c2, c2Days);
		
		
		System.out.printf("%-25s", "Employee ID");
		System.out.printf("%-15s", "Present");
		System.out.printf("%-15s", "Absent");
		System.out.printf("%-20s", "Deductions");
		System.out.println();
		
		
		System.out.printf("%-25s", m1.getEmployeeID());
		System.out.printf("%-15s", m1Days);
		System.out.printf("%-15s", m1.absent(m1Days));
		System.out.printf("%-20s", m1.deductions(m1Days));
		System.out.println();
		
		System.out.printf("%-25s", m2.getEmployeeID());
		System.out.printf("%-15s", m2Days);
		System.out.printf("%-15s", m2.absent(m2Days));
		System.out.printf("%-20s", m2.deductions(m2Days));
		System.out.println();
		
		System.out.printf("%-25s", c1.getEmployeeID());
		System.out.printf("%-15s", c1Days);
		System.out.printf("%-15s", c1.absent(c1Days));
		System.out.printf("%-20s", c1.deductions(c1Days));
		System.out.println();
		
		System.out.printf("%-25s", c2.getEmployeeID());
		System.out.printf("%-15s", c2Days);
		System.out.printf("%-15s", c2.absent(c2Days));
		System.out.printf("%-20s", c2.deductions(c2Days));
		System.out.println();
		
		int [] deduction = {m1.deductions(m1Days)+m2.deductions(m2Days)+c1.deductions(c1Days)+c2.deductions(c2Days)};
		
		for (int element: deduction) {
			System.out.println("Total deductions: $" + element);
        }

				
		


	}

}

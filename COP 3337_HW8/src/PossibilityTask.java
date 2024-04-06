import java.util.InputMismatchException;
import java.util.Scanner;
public class PossibilityTask {
	public static int combN(int n) throws Exception{
		if(n < 0) 
			throw new Exception("Invalid Number.");
		if(n <= 1)
			return 1;
		else
			return combN(n-1) * n;			
	}
	public static int combR(int r) throws Exception{
		if(r < 0) 
			throw new Exception("Invalid Number.");
		if(r <= 1)
			return 1;
		else
			return combR(r-1) * r;			
	}
	public static int combNR(int nR) throws Exception{
		if(nR < 0) 
			throw new Exception("Invalid Number.");
		if(nR <= 1)
			return 1;
		else
			return combNR(nR-1) * nR;			
	}

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n,r;
		int Combinations=1;
		
		try {
			System.out.println("Enter value for n:");
			n = scan.nextInt();
			System.out.println("Enter value for r:");
			r = scan.nextInt();
			int nR = n - r;
			if(n>r) {
				Combinations = combN(n)/(combR(r)*combNR(nR));
				System.out.println("There are " + Combinations + " possible combinations.");
			}
			else
				System.out.println("Error 'n' has to be greater than 'r'!!!");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input!! ");
			System.exit(0);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid number format!!");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Error only enter positive whole numbers!!");
			System.exit(0);
		}

	}

}

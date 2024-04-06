import java.util.InputMismatchException;
import java.util.Scanner;
public class HandshakeTask {
	public static int handshake(int num) {
		if(num < 1)
			return num;
		else
			return handshake(--num) + num;
		 
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("How many people are in the room? ");
			int num = scan.nextInt();
			System.out.println("If everyone shakes hands once, there will be " + handshake(num) + " handshakes.");
			
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
			System.out.println("Error!!");
			System.exit(0);
		}
		
	}

}

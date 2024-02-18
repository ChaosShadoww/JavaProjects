import java.util.Scanner;

public class TestPlaneSeating {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PlaneSeating ps = new PlaneSeating();
		String seatNumber;
		
		String q = " ";
		
		
		char[][] seat = new char[7][4];//2d array with 7 rows and 4 columns
		ps.fillSeating(seat);
		int seatsFilled = 0;

		System.out.println("You will be selecting seats for this airplane.");
		ps.printSeats(seat);
		System.out.println("You will input the seat selection using the row number and then the seat letter (ex - 3B)");
		System.out.println("Please enter the seat number or Q to quit.");
		seatNumber = scan.next();
	
			if(seatNumber.equals("Q")) {
				System.out.println("Program Terminated.");
				System.exit(0);
			}
			while(seatsFilled < 28 ) {
				int row = seatNumber.charAt(0) - '1';
	            int col = seatNumber.charAt(1) - 'A';
				//if statement to keep user in bounds of seating
				if(col < 0 || col > 4 || row > 7 || row < 0) {
					System.out.println("Invalid Input");
					System.out.println("You will input the seat selection using the row number and then the seat letter (ex - 3B)");
					System.out.println("Please enter the seat number or Q to quit.");
					seatNumber = scan.next();
					if(seatNumber.equals("Q")) {
						System.out.println("Program Terminated.");
						System.exit(0);
					}
				}
				//else statement to check for seat filling and put an X if seat has not been filled up yet
				else {
					if(seat[row][col] != 'X') {
						seat[row][col] = 'X';
						seatsFilled++;
						System.out.println(" ");
						ps.printSeats(seat);
						
					}
					else {
						System.out.println("Seat has already been assigned");
						System.out.println("Please enter another seat number");
						ps.printSeats(seat);
					}
					if(seatsFilled < 28) {
						System.out.println("You will input the seat selection using the row number and then the seat letter (ex - 3B)");
						System.out.println("Please enter the seat number or Q to quit.");
						seatNumber = scan.next();
						
					}
				
				}
			
				
				
			}//end while loop
		
			
			 
		
		
		
	}//end main class
	

}//end TestPlaneSeating Class

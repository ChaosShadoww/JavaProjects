import java.util.Scanner;

public class PlaneSeating {
	Scanner scan = new Scanner(System.in);

	public static void fillSeating(char[][] seat) {
		for(int row=0; row < 7; row++) {
			for(int col=0; col< 4;col++) {
				seat[row][col] = (char) ('A' + col);			
				}
		}//end for loop
	}//end method
	


	public static void printSeats(char[][] seat) {
        for (int row = 0; row < 7; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < 4; col++) {
                System.out.print(seat[row][col] + " ");
            }
            System.out.println();
        }
    }


	

}//end class
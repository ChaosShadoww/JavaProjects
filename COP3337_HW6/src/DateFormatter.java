import java.util.Scanner;
import java.util.InputMismatchException;

class MonthException extends Exception{
	public MonthException() {
		super();
	}
	public MonthException(String mth) {
		super(mth);
	}
}
class DayException extends Exception{
	public DayException() {
		super();
	}
	public DayException(String dy) {
		super(dy);
	}	
}
class YearException extends Exception{
	public YearException() {
		super();
	}
	public YearException(String yr) {
		super(yr);
	}
}
public class DateFormatter {
	public static int formMth(int month) throws MonthException{
		if(month < 1 || month > 12) 
			throw new MonthException("Invalid Month! Reenter a Valid Month");
		return month;	
	}
	public static int formDy(int day, int month) throws DayException{
		if(day < 1 || day > 31) {
			throw new DayException("Invalid Day! Reenter a Valid Day");
		}
		
		if(day > 28 && month == 2)
			throw new DayException("Invalid Day! Reenter a Valid Day");
		if(day >30)
			if(month == 4 || month == 6 || month == 9 || month == 11)
				throw new DayException("Invalid Day for Month Entered!");
		return day;
	}
	public static int formYr(int year) throws YearException{
		if(year < 1000 || year > 3000)
			throw new YearException("Invalid Year. Please enter a year in the range of 1000 to 3000!");
		return year;
	}
	public static void main(String[] args) throws MonthException, DayException, YearException {
		Scanner scan = new Scanner(System.in);
		boolean check = false;
		System.out.println("Enter date to parse (MM/DD/YYYY format)");
		String date = scan.next();
		String[] dateArr = date.split("/");
		int month = Integer.parseInt(dateArr[0]);    
		int day = Integer.parseInt(dateArr[1]);     
		int year = Integer.parseInt(dateArr[2]);
		String sMonth = "";
		while(!check) {
		try {
		formMth(month);
		formDy(day,month);
		formYr(year);
		if(month == 1)
			sMonth = "January";
		if(month == 2)
			sMonth = "February";
		if(month == 3)
			sMonth = "March";
		if(month == 4)
			sMonth = "April";
		if(month == 5)
			sMonth = "May";
		if(month == 6)
			sMonth = "June";
		if(month == 7)
			sMonth = "July";
		if(month == 8)
			sMonth = "August";
		if(month == 9)
			sMonth = "September";
		if(month == 10)
			sMonth = "October";
		if(month == 11)
			sMonth = "November";
		if(month == 12)
			sMonth = "December";
		check = true;
		}
		catch(MonthException e){
			System.out.println(e.getMessage());
			month = scan.nextInt();			
		}
		catch(DayException e) {
			System.out.println(e.getMessage());
			day = scan.nextInt();	
		}
		catch(YearException e) {
			System.out.println(e.getMessage());
			year = scan.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		
		}
		System.out.println("Parsed date: " + sMonth + " " + formDy(day,month) + ", " + formYr(year));
		
		}	
	}



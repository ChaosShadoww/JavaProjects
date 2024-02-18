
// list of all the java packages
// creat list of the arrayLits 
// Read the .text files downloaded
// priint of the datas


import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

// end java packages

public class MainProject {

    public static void main(String[] args) throws FileNotFoundException {
       
      // variables
      int nOption = 0;
      Scanner input = new Scanner(System.in);
      DataReader reader = new DataReader();
      DataUtil util = new DataUtil();
      
      ArrayList<Student1> studList = new ArrayList<Student1>();
      ArrayList<Faculty> factList = new ArrayList <Faculty>();
      ArrayList<CourseRoster> CourseRosterList = new ArrayList <CourseRoster>();
      ArrayList<Department> DepartmentList = new ArrayList <Department>();
      ArrayList<Major> MajorList = new ArrayList <Major>();
      ArrayList<Schedule> SchedList = new ArrayList <Schedule>();
      
      // store data
      reader.storeStudent(studList, "Students.txt");
      reader.store(SchedList, "Schedule.txt");
      reader.storeCourseRoster(CourseRosterList, "CourseRoster.txt");
      reader.storeDepartment(DepartmentList,"Department.txt");
      reader.storeFaculty(factList, "Faculty.txt");
      reader.storeMajor(MajorList,"Major.txt");
      
   
      System.out.println("STUDENT, FACULTY AND COURSE INFORMATION MENU");
        System.out.println("1. View student information");
        System.out.println("2. View course schedule");
        System.out.println("3. Create a new student");
        System.out.println("4. Create a new course");
        System.out.println("5. Print course list for a student");
        System.out.println("6. Add a student to a course");
        System.out.println("7. View faculty information");
        System.out.println("8. Print a list courses for a faculty member");
        System.out.println("10. Exit");
        
        //prompt user to make a choice
        System.out.println("Please enter the number of your choice");
        nOption = input.nextInt();
        
        while(nOption != 10){
        if(nOption == 1){
        	
                System.out.println("View student information:");
                
               System.out.println("StudentId");
                String CourseID = input.next();
                System.out.println("FirstName");
                String FirstName = input.next();
                System.out.println("LastName");
                String LastName = input.next();
                System.out.println("Street");
                String Street = input.next();
                System.out.println("City");
                String City = input.next();
                System.out.println("State");
                int State = input.nextInt();
                System.out.println("ZipCode");
                int ZipCode = input.nextInt();
                System.out.println("Phone");
                int Phone = input.nextInt();
                System.out.println("Email");
                int Email = input.nextInt();
                System.out.println("MajorID");
                int MajorID = input.nextInt();
                System.out.println("ExpectedGaraduationDate");
                String ExpectedGaraduationDate = input.next();
                
                System.out.println("Faclty ID assigned to teach The Course :");
                
                
                
            }
            
            if(nOption == 2){
                System.out.println("View course schedule :");
                
              System.out.println("Term");
              String Terms = input.next(); 
              System.out.println("Room");
              String Room = input.next();  
              System.out.println("CourseID");
              String CourseID = input.next();  
              System.out.println("Title");
              String Title = input.next();
              System.out.println("Credit Hours");
              int CreditHours = input.nextInt();
              System.out.println("Capacity");
              String Capacity = input.next();
              System.out.println("FacultyID");
              String FacultyID = input.next();
            }
            
            if(nOption == 3){
                System.out.println("Create a new student:");
                
                System.out.println("Student Id");
                String CourseID = input.next();
                System.out.println("First Name");
                String FirstName = input.next();
                System.out.println("Last Name");
                String LastName = input.next();
                System.out.println("Street");
                String Street = input.next();
                System.out.println("City");
                String City = input.next();
                System.out.println("State");
                int State = input.nextInt();
                System.out.println("ZipCode");
                int ZipCode = input.nextInt();
                System.out.println("Phone");
                int Phone = input.nextInt();
                System.out.println("Email");
                int Email = input.nextInt();
                System.out.println("MajoID");
                
                
            }// end option 3
            
            if(nOption == 4){
                System.out.println("Create a new course :");
                
                System.out.println("CourseID");
                String CourseID = input.next();
                System.out.println("Title");
                String Title = input.next();
                System.out.println("Term");
                String Terms = input.next();
                System.out.println("Room");
                String Room = input.next();
                System.out.println("Capacity");
                String Capacity = input.next();
                System.out.println("Credit Hours");
                int CreditHours = input.nextInt();
                System.out.println("Faclty ID assigned to teach The Course :");
                String FacultyId = input.next();
                
                //scheduleList.add(new Schedule(Title, CourseID, CRN, Term, facultyId, Room, Capacity, CreditHours));
                
                
            }// end option 4
            
            if(nOption == 5){
                System.out.println("Print course list for a student :");
                
                System.out.println("CRN");
                String CRN = input.next();
                System.out.println("StudentId");
                String CourseID = input.next();
                System.out.println("Grade");
                String Grade = input.next();
                
            }// end option 5
            
            if(nOption == 6){
                System.out.println("Add a student to a Course:");
                 
                System.out.println("FirstName");
                String FirstName = input.next();
                System.out.println("LastName");
                String LastName = input.next();
                System.out.println("CourseID");
                String CourseID = input.next();
                
            }// end option 6
            
            if(nOption == 7){
                System.out.println("Faclty ID assigned to teach The Course :");
                String FacultyId = input.next();
                 System.out.println("FirstName");
                String FirstName = input.next();
                System.out.println("LastName");
                String LastName = input.next();
                System.out.println("HireDate");
                String HireDate = input.next();
                System.out.println("Title");
                String Title = input.next();
                System.out.println("Salary");
                String Salary = input.next();
                System.out.println("Street");
                String Street = input.next();
                System.out.println("City");
                String City = input.next();
                System.out.println("State");
                int State= input.nextInt();
                System.out.println("ZipCode");
                int ZipCode= input.nextInt();
                System.out.println("Phone");
                String Phone = input.next();
                System.out.println("Email");
                String Email = input.next();
                System.out.println("DepartmentID");
                String DepartmentID = input.next();
                 
                System.out.println("Faclty ID assigned to teach The Course :");
        
        if(nOption == 8){
            
        }
            
        System.out.println("Please enter another choice");
        nOption = input.nextInt();
            
        }//end while loop
       
       // print data
      System.out.println("--------Faculty--------");
      util.printFacultyList(factList);
      System.out.println("--------Student--------");
      util.printScheduleList(SchedList);
      System.out.println("--------Department--------");
      util.printDepartmentList(DepartmentList);
      System.out.println("--------Schedule--------");
      util.printScheduleList(SchedList);
      System.out.println("--------Major--------");
      util.printMajorList(MajorList);
      System.out.println("--------CourseRoster--------");
      util.printCourseRosterList(CourseRosterList);


    }// end main method
    
}//end class MainProject
}        
    
    


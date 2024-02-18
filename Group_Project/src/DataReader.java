import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;



public class DataReader {
    
    public void storeMajor(ArrayList<Major> MajorList, String filename)throws FileNotFoundException{
       String sFileName = filename;
       String sInputLine = " ";
       File fileToOpen = new File(sFileName);
       Scanner inputFile = new Scanner(fileToOpen);
       String[] saTokens = null;
       while (inputFile.hasNext()){
         sInputLine = inputFile.nextLine();
         saTokens = sInputLine.split(":");
         Major s = new Major();
         s.setnMajorID(Integer.parseInt(saTokens[0]));
         s.setsMajorName(saTokens[1]);
        // s.setsDepartmentId(saTokens[2]);
         MajorList.add(s);
           
       }// end while loop
       //close file
       inputFile.close();
    }
      public void storeStudent(ArrayList<Student1> StudentList, String filename)throws FileNotFoundException{
       String sFileName = filename;
       String sInputLine = " ";
       File fileToOpen = new File(sFileName);
       Scanner inputFile = new Scanner(fileToOpen);
       String[] saTokens = null;
       while (inputFile.hasNext()){
           sInputLine = inputFile.nextLine();
           saTokens = sInputLine.split(":");
           Student1 s = new Student1();
           s.setsStudentId(saTokens[0]);
           s.setsFirstName(saTokens[1]);
           s.setsLastName(saTokens[2]);
           s.setsStreet(saTokens[3]);
           s.setsCity(saTokens[4]);
           s.setsState(saTokens[5]);
           s.setnZipCode(Integer.parseInt(saTokens[6]));
           s.setsPhone((saTokens[7]));
           s.setsEmail(saTokens[8]);
           s.setnMajorID(Integer.parseInt(saTokens[9]));
           s.setsExpectedGraduationDate(saTokens[10]);
           StudentList.add(s);
            
       }// end while loop
       //close file
       inputFile.close();
    }
      
       public void storeCourseRoster(ArrayList<CourseRoster> CourseRosterList, String filename)throws FileNotFoundException{
       String sFileName = filename;
       String sInputLine = " ";
       File fileToOpen = new File(sFileName);
       Scanner inputFile = new Scanner(fileToOpen);
       String[] saTokens = null;
       while (inputFile.hasNext()){
           sInputLine = inputFile.nextLine();
           saTokens = sInputLine.split(":");
           CourseRoster s = new CourseRoster();
           s.setsCRN(saTokens[0]);
           s.setsStudentId(saTokens[1]);
           s.setsGrade(saTokens[2]);
           CourseRosterList.add(s);
           
             
       }// end while loop
       //close file
       inputFile.close();
    }
        // method to read the faculty data
    public void storeFaculty(ArrayList<Faculty> FacultyList, String filename) throws FileNotFoundException {
       File fileToOpen = new File("Faculty.txt");// to open file
       Scanner inputFile = new Scanner(fileToOpen);// to scan the content of the file
       String[] saTokens = null;// string to store the contents of faculty
       
       // while loop to read file
       while(inputFile.hasNext()){
           String sInputLine = inputFile.nextLine();
           saTokens = sInputLine.split(":");
           Faculty f = new Faculty();
           f.setsFacultyID(saTokens[0]);
           f.setsFirstName(saTokens[1]);
           f.setsLastName(saTokens[2]);
           f.setsHireDate(saTokens[3]);
           f.setsTitle(saTokens[4]);
           f.setdSalary(Double.parseDouble(saTokens[5]));
           f.setsStreet(saTokens[6]);
           f.setsCity(saTokens[7]);
           f.setsState(saTokens[8]);
           f.setnZipCode(Integer.parseInt(saTokens[9]));
           f.setsPhone(saTokens[10]);
           f.setsEmail(saTokens[11]);
           f.setsDepartmentID(saTokens[12]);
           FacultyList.add(f);
          
       }//end while loop
       
       //close file
       inputFile.close();
    }// end method storefaculty
    
    

    
    //method to read Department data
    public void storeDepartment(ArrayList<Department> DepartmentList, String filename)throws FileNotFoundException {
        String sFileName = "Department.txt";// to store the file in sFileName
        String sInputLine = "";// to receive the data from the scanner
        File fileToOpen = new File(sFileName);// to open the file
        Scanner inputFile = new Scanner(fileToOpen);// to receive the data from the file
        String[] saTokens = null;// to store the individual content of department
        
        //while loop to read file
        while(inputFile.hasNext()){
           sInputLine = inputFile.nextLine();
           saTokens = sInputLine.split(":");
           Department d = new Department();
           d.setnDepartmentID(Integer.parseInt(saTokens[0]));
           d.setsDepartmentName(saTokens[1]);
           DepartmentList.add(d);
        }// end while loop
        
        // close file
        inputFile.close();
    

    }// end method storeDepartment
    
    
 public void storeFacultyInformation(ArrayList<Faculty> FacultyList, String filename) throws FileNotFoundException{
     File fileToOpen = new File("Faculty.txt");// to open file
       Scanner inputFile = new Scanner(fileToOpen);// to read file
       String[] saTokens = null;// to store individual contents of the file
       
       // while loop to read file
       while(inputFile.hasNext()){
           String sInputLine = inputFile.nextLine();
           saTokens = sInputLine.split(":");
           Faculty f = new Faculty();
           f.setsFacultyID(saTokens[0]);
           f.setsFirstName(saTokens[1]);
           f.setsLastName(saTokens[2]);
           f.setsHireDate(saTokens[3]);
           f.setsTitle(saTokens[4]);
           f.setdSalary(Double.parseDouble(saTokens[5]));
           f.setsStreet(saTokens[6]);
           f.setsCity(saTokens[7]);
           f.setsState(saTokens[8]);
           f.setnZipCode(Integer.parseInt(saTokens[9]));
           f.setsPhone(saTokens[10]);
           f.setsEmail(saTokens[11]);
           f.setsDepartmentID(saTokens[12]);
           FacultyList.add(f);
       }//end while loop
           
     
     
     
 }// end method storeFacultyInformation        
 public void store(ArrayList<Schedule> ScheduleList, String filename)throws FileNotFoundException{
       String sFileName = filename;
       String sInputLine = " ";
       File fileToOpen = new File(sFileName);
       Scanner inputFile = new Scanner(fileToOpen);
       String[] saTokens = null;
       while (inputFile.hasNext()){
           sInputLine = inputFile.nextLine();
           saTokens = sInputLine.split(":");
           Schedule s = new Schedule();
           s.setsRoom(saTokens[0]);
           s.setsTerm(saTokens[1]);
           s.setsCRN(saTokens[2]);
           s.setsCourseID(saTokens[3]);
           s.setsTitle(saTokens[4]);
           s.setsCreditHours(saTokens[5]);
           s.setsFacultyID(saTokens[6]);
           s.setsCapacity(saTokens[7]);
           ScheduleList.add(s);
       }// end while loop
       //close file
       inputFile.close();
       
       
 }// end method
} // end class Data Reader  
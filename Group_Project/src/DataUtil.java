import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DataUtil {
   // This code first creates an ArrayLists called Print CourseRoster ,DepartmentList, FacultyList, New Faculty, and New Student
    public void printCourseRosterList(ArrayList<CourseRoster> courseRosterList){
        for(CourseRoster s:courseRosterList ){
            s.printCourseRoster();
        }// end for loop
    }// end method printCourseRosterList
    
    
      private String facID;
    
    
    // method to print the faculty list
    public void printFacultyList(ArrayList<Faculty> facList){
        for (int nIndex = 0; nIndex < facList.size(); nIndex++) {
            
        }//end for loop
        for(Faculty f: facList){
            f.printFaculty();
        }//end for loop
        
    }// end method printFacultyList
    
    // method to print the Department lsit
    public void printDepartmentList(ArrayList<Department> departList){
        for (int nIndex = 0; nIndex < departList.size(); nIndex++) {
            
        }//end for loop
        for(Department d: departList){
            d.printDepartment();
        }//end for loop
    }// end method printDepartmentList
    
    //method to create a new faculty member
    public void createNewFaculty(ArrayList<Faculty> facList){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int max = 99999999;
        int min = 10000000;
        boolean zNumberFound = false;
        String zNumber = "";
        
        String sFacultyID; //variable to store the Faculty ID
        String sFirstName; //variable to store the  First Name
        String sLastName;  //variable to store the Last Name     
        String sHireDate;   //variable to store the Hire date     
        String sTitle; //variable to store the position or job title
        double dSalary;  //variable to store the Salary      
        String sStreet;   //variable to store the Street address     
        String sCity; //variable to store the City Name       
        String sState;  //variable to store the State Name      
        int nZipCode; //variable to store the zip code       
        String sPhone; //variable to store the phone number       
        String sEmail; //variable to store the email address       
        String sDepartmentID;  //variable to store the department ID
        
        do{
            int randomNum = rand.nextInt((max - min) + 1) + min;
            zNumber = "Z" + randomNum;
            zNumberFound = true;
            
            for (Faculty f : facList){
              
                if (f.getsFacultyID().equals(zNumber)){
                    zNumberFound = false;
                    break;
                }// end if loop
            }// end for loop
            
        }while (zNumberFound == false);
        // to prompt the user for information to add a new faculty
        System.out.println("\n\nPlease enter the following info: ");
        System.out.print("\nFirst Name: ");
        sFirstName = input.nextLine();
        System.out.print("\nLast Name: ");
        sLastName = input.nextLine();
        System.out.print("\nHire Date: ");
        sHireDate = input.nextLine();
        System.out.print("\nJob Title: ");
        sTitle = input.next();
        System.out.print("\nSalary: ");
        dSalary = input.nextDouble();
        System.out.print("\nStreet: ");
        sStreet = input.next();
        System.out.print("\nCity: ");
        sCity = input.next();
        System.out.print("\nState: ");
        sState = input.next();
        System.out.print("\nZip: ");
        nZipCode = input.nextInt();
        System.out.print("\nPhone: ");
        sPhone = input.next();
        System.out.print("\nEmail: ");
        sEmail = input.next();
        System.out.print("\nDepartmentID: ");
        sDepartmentID = input.next();
        
        facList.add(new Faculty(zNumber, sFirstName, sLastName, sHireDate, sTitle, dSalary, sStreet, sCity, sState, nZipCode, sPhone, sEmail, sDepartmentID));
        
        System.out.println("\nFaculty added with Znumber = " + zNumber);
    }// end method createNewFaculty
    
    
    //method to print the course list of each faculty
    public void printFacultyCourseList() throws FileNotFoundException{
        String sFileName1 = "Courses-Z23118994.txt";
        File fileToOpen1 = new File(sFileName1);
        String sInputLine1 = "";
        Scanner inputFile1 = new Scanner(fileToOpen1);
        String sFileName2 = "Courses-Z23118683.txt";
        File fileToOpen2 = new File(sFileName2);
        String sInputLine2 = "";
        Scanner inputFile2 = new Scanner(fileToOpen2);
        String sFileName3 = "Courses-Z23117944.txt";
        File fileToOpen3 = new File(sFileName3);
        String sInputLine3 = "";
        Scanner inputFile3 = new Scanner(fileToOpen3);
        String sFileName4 = "Courses-Z23116998.txt";
        File fileToOpen4 = new File(sFileName4);
        String sInputLine4 = "";
        Scanner inputFile4 = new Scanner(fileToOpen4);
        String sFileName5 = "Courses-Z23116326.txt";
        File fileToOpen5 = new File(sFileName5);
        String sInputLine5 = "";
        Scanner inputFile5 = new Scanner(fileToOpen5);
        String sFileName6 = "Courses-Z23116257.txt";
        File fileToOpen6 = new File(sFileName6);
        String sInputLine6 = "";
        Scanner inputFile6 = new Scanner(fileToOpen6);
        String sFileName7 = "Courses-Z23116246.txt";
        File fileToOpen7 = new File(sFileName7);
        String sInputLine7 = "";
        Scanner inputFile7 = new Scanner(fileToOpen7);
        String sFileName8 = "Courses-Z23116032.txt";
        File fileToOpen8 = new File(sFileName8);
        String sInputLine8 = "";
        Scanner inputFile8 = new Scanner(fileToOpen8);
        String sFileName9 = "Courses-Z23115967.txt";
        File fileToOpen9 = new File(sFileName9);
        String sInputLine9 = "";
        Scanner inputFile9 = new Scanner(fileToOpen9);
        String sFileName10 = "Courses-Z23115591.txt";
        File fileToOpen10 = new File(sFileName10);
        String sInputLine10 = "";
        Scanner inputFile10 = new Scanner(fileToOpen10);
        
        
        while(inputFile1.hasNext()){
           sInputLine1 = inputFile1.nextLine();
           System.out.println(sInputLine1);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile2.hasNext()){
           sInputLine2 = inputFile2.nextLine();
           System.out.println(sInputLine2);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile3.hasNext()){
           sInputLine3 = inputFile3.nextLine();
           System.out.println(sInputLine3);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile4.hasNext()){
           sInputLine4 = inputFile4.nextLine();
           System.out.println(sInputLine4);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile5.hasNext()){
           sInputLine5 = inputFile5.nextLine();
           System.out.println(sInputLine5);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile6.hasNext()){
           sInputLine6 = inputFile6.nextLine();
           System.out.println(sInputLine6);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile7.hasNext()){
           sInputLine7 = inputFile7.nextLine();
           System.out.println(sInputLine7);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile8.hasNext()){
           sInputLine8 = inputFile8.nextLine();
           System.out.println(sInputLine8);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile9.hasNext()){
           sInputLine9 = inputFile9.nextLine();
           System.out.println(sInputLine9);
           
        }// end while loop
        System.out.println("\n");
        while(inputFile10.hasNext()){
           sInputLine10 = inputFile10.nextLine();
           System.out.println(sInputLine10);
           
        }// end while loop
        System.out.println("\n");
       
        
        
	inputFile1.close();
        inputFile2.close();
        inputFile3.close();
        inputFile4.close();
        inputFile5.close();
        inputFile6.close();
        inputFile7.close();
        inputFile8.close();
        inputFile9.close();
        inputFile10.close();
        
     
        
    }// end method printFacultyCourseList
    
    //method to print each fcaulty individual information
    public void printFacultyInfo(String facID, ArrayList<Faculty> facList, ArrayList<Department> departList){
        Scanner input = new Scanner(System.in);
        //String facId = "";
        String department = "";
        
        for (Faculty f : facList) {
         if (f.getsFacultyID().equalsIgnoreCase(facID)){
            String phone = f.getsPhone();
            String facNum = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)","($1)$2-$3");
            String[] date = f.getsHireDate().split("/");
            String month2 = "";
            int month = Integer.parseInt(date[0]);
            if(month == 1){
                month2 = "January";
            }
            else if(month == 2){
                month2 = "February";
            }
            else if(month == 3){
                month2 = "March";
            }
            else if(month == 4){
                month2 = "April";
            }
            else if(month == 5){
                month2 = "May";
            }
            else if(month == 6){
                month2 = "June";
            }
            else if(month == 7){
                month2 = "July";
            }
            else if(month == 8){
                month2 = "August";
            }
            else if(month == 9){
                month2 = "September";
            }
            else if(month == 10){
                month2 = "October";
            }
            else if(month == 11){
                month2 = "November";
            }
            else if(month == 12){
                month2 = "December";
            }
            
            String day = date[1];
            String year = date[2];
            
            facList.add(f);
            for(Department d: departList) {
                if((d.getnDepartmentID()) == Integer.parseInt(f.getsDepartmentID())){
                    department = d.getsDepartmentName();
                    
        
                    break;
                }// end depart if loop
            }//end department for loop 
        System.out.println("Detailed information for Faculty Member: " + facID);
        System.out.println("Name: " + f.getsFirstName() + " " + f.getsLastName());
        System.out.println("Address: " + f.getsStreet() + ", " + f.getsCity() + ", " + f.getsState() + " " + f.getnZipCode());
        System.out.println("Phone: " + facNum);
        System.out.println("Email: " + f.getsEmail());
        System.out.println("Position: " + f.getsTitle());
        System.out.println("Hire Date: " + month2 + " " + day + ", " + year);
        System.out.println("Department: " + department);
        
        break;    
            
            
        }else{
             System.out.println("Faculty not found");
         }//end fac if loop
        

        }// end faculty for loop
    

    
    }// end method printFacultyInfo    
    
    
    
    
    public void printMajorList(ArrayList<Major> majorList){
        for(Major s:majorList){
            s.printMajor();
        }// end for loop
    }// end printMajorList
    public void printScheduleList(ArrayList<Schedule> scheList){
        for(Schedule s: scheList){
            s.printSchedule();
        }// end for loop
    }// end printScheduleList
    public void printStudentList(ArrayList<Student1> StuList){
        for (Student1 s: StuList){
            s.printStudent();
        }// end printStudentList
    }
    
    
    public void createNewStudent(ArrayList<Student1> studentList, ArrayList<Major> majorList){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int max = 99999999;
        int min = 10000000;
        boolean zNumberFound = false;
        String zNumber = "";
        
        String firstName;// variable to store the First Name
        String lastName;// variable to store the Last Name
        String street;// variable to store Street
        String city;// variable to store city
        String state;// variable to store State
        int zip;// variable to store the Zip
        Long phone; // variable to store Phone
        String email; // variable to store Email
        String majorId; // Variable to store MajorId
        String graduationDate; // Variable to store graduationDate
        
        do{
            int randomNum = rand.nextInt((max - min) + 1) + min;
            zNumber = "Z" + randomNum;
            zNumberFound = true;
            
            for (Student1 s : studentList){
                //Student s = (Student)d;
                if (s.getsStudentId().equals(zNumber)){
                    zNumberFound = false;
                    break;
                }// end if statement
            }//end loop
            
        }while (zNumberFound == false);
        // informations for the User to enter a new Student
        System.out.println("\n\nPlease enter the following info: ");
        System.out.print("\nFirst Name: ");
        firstName = input.nextLine();
        System.out.print("\nLast Name: ");
        lastName = input.nextLine();
        System.out.print("\nStreet: ");
        street = input.nextLine();
        System.out.print("\nCity: ");
        city = input.nextLine();
        System.out.print("\nState: ");
        state = input.nextLine();
        System.out.print("\nZip: ");
        zip = input.nextInt();
        System.out.print("\nPhone: ");
        phone = input.nextLong();
        System.out.print("\nEmail: ");
        email = input.next();
        
        System.out.println("\nSelect one for the following majors: ");
        boolean majorSelected = false;
        int majorIndex = 0;
        
        do{
            majorSelected = true;
            int i;
            
            for(i = 0 ; i < majorList.size() ; i++){
                Major m = majorList.get(i);
                System.out.println(String.format("%s. %s", i+1, m.getsMajorName()));
            }

            System.out.print("\n\nMajor selection:");
            int selection = input.nextInt();

            if( selection < 1 || selection > majorList.size()){
                System.out.println("Invalid major!!");
                majorSelected = false;
            }else{
                majorIndex = selection - 1;
            }
            
        }while( majorSelected == false);
        
        int MajorId = majorList.get(majorIndex).getnMajorID();
        
        System.out.print("\nExpected graduation date: ");
        graduationDate = input.next();
        
      studentList.add(new Student1());
        
        System.out.println("\nStudent added with Znumber = " + zNumber);
        
    }// end method CreatNewStudent
    
    
    public void printStudentInfo(String id, ArrayList<Student1> studentList, ArrayList<Major> majorList){
        
        for(Student1 s : studentList){
            
            if (s.getsStudentId().equals( id)){
                String phone = s.getsPhone();
                String phoneNumber = "(954)994-1456";
                String formattedPhoneNumber = String.format("%s", phoneNumber);

                String major = "";
                
                for (Major m : majorList){
                   //Major m = (Major) p;
                   
               if (m.getnMajorID() == s.getnMajorID()) {
               major = m.getsMajorName();
               break;
              }// end of the for loop 

                
               String[] date = s.getsExpectedGraduationDate().split("/");
               int month = Integer.parseInt(date[0]);
               String year = date[1];
            }
        }
        
    }
        
    
      
  }// end class DataUtil
    
    
    
    
}

//We create a for loop that scan the student list 
// in this for loop we will verify if the Id exist in the Student List 
// if the Student List doesn's exist we disply (else)student List not Found
// if the Id exist .. We will get the Major Name 
// and create a for loop that scan the major & compares it to Student
// and finallly get Major name
/*
for faculty data
*/
import java.io.File;
public class Faculty {
       private String sFacultyID; //variable to store the Faculty ID
       private String sFirstName; //variable to store the  First Name
       private String sLastName;  //variable to store the Last Name     
       private String sHireDate;   //variable to store the Hire date     
       private String sTitle; //variable to store the position or job title
       private double dSalary;  //variable to store the Salary      
       private String sStreet;   //variable to store the Street address     
       private String sCity; //variable to store the City Name       
       private String sState;  //variable to store the State Name      
       private int nZipCode; //variable to store the zip code       
       private String sPhone; //variable to store the phone number       
       private String sEmail; //variable to store the email address       
       private String sDepartmentID;  //variable to store the department ID
       
       
    // default constructor
    public Faculty() {
    }
    
    // overloaded constructor

    public Faculty(String sFacultyID, String sFirstName, String sLastName, String sHireDate, String sTitle, double dSalary, String sStreet, String sCity, String sState, int nZipCode, String sPhone, String sEmail, String sDepartmentID) {
        this.sFacultyID = sFacultyID;
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sHireDate = sHireDate;
        this.sTitle = sTitle;
        this.dSalary = dSalary;
        this.sStreet = sStreet;
        this.sCity = sCity;
        this.sState = sState;
        this.nZipCode = nZipCode;
        this.sPhone = sPhone;
        this.sEmail = sEmail;
        this.sDepartmentID = sDepartmentID;
    }

    
    
  // getters and setters

    public String getsFacultyID() {
        return sFacultyID;
    }// end method getdFacultyID

    public String getsFirstName() {
        return sFirstName;
    }// end method getsFirstName

    public String getsLastName() {
        return sLastName;
    }// end method getsLastName

    public String getsHireDate() {
        return sHireDate;
    }// end method getsHireDate

    public String getsTitle() {
        return sTitle;
    }// end method getsTitle

    public double getdSalary() {
        return dSalary;
    }// end method getdSalary

    public String getsStreet() {
        return sStreet;
    }// end method getdStreet

    public String getsCity() {
        return sCity;
    }// end method getsCity

    public String getsState() {
        return sState;
    }// end method getsState

    public int getnZipCode() {
        return nZipCode;
    }// end method getnZipCode

    public String getsPhone() {
        return sPhone;
    }// end method getdPhone

    public String getsEmail() {
        return sEmail;
    }// end method getsEmail

    public String getsDepartmentID() {
        return sDepartmentID;
    }// end method getdDepartmentID

    public void setsFacultyID(String sFacultyID) {
        this.sFacultyID = sFacultyID;
    }//end method setdFacultyID

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }//end method setsFirstName

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }//end method setsLastName

    public void setsHireDate(String sHireDate) {
        this.sHireDate = sHireDate;
    }//end method setsHireDate

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }//end method setsTitle

    public void setdSalary(double dSalary) {
        this.dSalary = dSalary;
    }//end method setdSalary

    public void setsStreet(String sStreet) {
        this.sStreet = sStreet;
    }//end method setdStreet

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }//end method setsCity

    public void setsState(String sState) {
        this.sState = sState;
    }//end method setsSate

    public void setnZipCode(int nZipCode) {
        this.nZipCode = nZipCode;
    }//end method setdZipCode

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }//end method setdPhone

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }//end method setsEmail

    public void setsDepartmentID(String sDepartmentID) {
        this.sDepartmentID = sDepartmentID;
    }//end method setdDepartmentID
    
    
    

    
    // to print the faculty info
    public void printFaculty(){
       String sFacultyFormatted = String.format("%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s", sFacultyID, sFirstName, sLastName, 
               sHireDate, sTitle, dSalary, sStreet, sCity, sState, nZipCode, sPhone, sEmail, sDepartmentID);
        System.out.println(sFacultyFormatted);
       
    
    }// end class facultyInfo          
        

  
    
    
}// end Faculty class

/*
class for the department data
*/

import java.io.File;

public class Department {
    private int nDepartmentID;// variable to store the Department ID
    private String sDepartmentName;// variable to store the Department Name
        
    // default constructor
    public Department() {
        
    }
    //overloaded constructor
    public Department(int nDepartmentID, String sDepartmentName){
        this.nDepartmentID = nDepartmentID;
        this.sDepartmentName = sDepartmentName;
    }
    // getters and setters

    public int getnDepartmentID() {
        return nDepartmentID;
    }// end method getnDepartmentID

    public void setnDepartmentID(int nDepartmentID) {
        this.nDepartmentID = nDepartmentID;
    }// end method setnDepartmentID

    public String getsDepartmentName() {
        return sDepartmentName;
    }// end method getsDepartmentName

    public void setsDepartmentName(String sDepartmentName) {
        this.sDepartmentName = sDepartmentName;
    }// end method setsDepartmentName
    
    
    // to print the faculty info
    public void printDepartment(){
        String sDepartmentFormatted = String.format("%-24s%-24s", nDepartmentID, sDepartmentName);
        System.out.println(sDepartmentFormatted);
        
        
    }    
        
        
        
        
        
}

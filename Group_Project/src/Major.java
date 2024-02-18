//Duvens
public class Major {
   private int nMajorId;//variable to store the Major ID
   private String sMajorName;//variable to store the Major Name
   private String sDepartmentId;//variable to store the Department Id
   
    // default constructor
    public Major() {
    }

    public Major(int nMajorID, String sMajorName, String sDepartmentID) {
        this.nMajorId = nMajorID;
        this.sMajorName = sMajorName;
        this.sDepartmentId = sDepartmentID;
    }

    public String getsDepartmentID() {
        return sDepartmentId;
    }

    public void setsDepartmentID(String sDepartmentID) {
        this.sDepartmentId = sDepartmentID;
    }

    public int getnMajorID() {
        return nMajorId;
    }

    public void setnMajorID(int nMajorID) {
        this.nMajorId = nMajorID;
    }

    public String getsMajorName() {
        return sMajorName;
    }

    public void setsMajorName(String sMajorName) {
        this.sMajorName = sMajorName;
    }// end of the constructor
   
   public void printMajor(){
       System.out.println("Major Id : " + this.nMajorId);
       System.out.println("Major Name : " + sMajorName + " " +sDepartmentId );
       
       
       String sMajorFormated = String.format("%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s", nMajorId, sMajorName, sDepartmentId);
       System.out.println(sMajorFormated);
   }
   
  
   
}// end class Major

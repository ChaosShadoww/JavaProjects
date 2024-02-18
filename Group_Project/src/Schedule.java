

public class Schedule {
    private String sRoom;
	private String sTerm;//variable to store the Term
	private String sCRN;//variable to store the CRN
    private String sCourseID;//variable to store the Course ID
    private String sTitle;//variable to store the Title
    private String sCreditHours;//variable to store the CreditHours
    private String sFacultyID;//variable to store the Faculty ID
    private String sCapacity;//variable to store the Capacity
    
    //  getters and setters 
    
    public void setsCreditHours(String sCreditHours)
    {
        this.sCreditHours = sCreditHours;
    }

    public void setsTerm(String sterm) 
    {
        this.sTerm = sterm;
    }

    public void setsCRN(String sCRN) 
    {
        this.sCRN = sCRN;
    }

    public void setsCapacity(String sCapacity) 
    {
        this.sCapacity = sCapacity;
    }
    
    public void setsCourseID(String sCourseID)
    {
        this.sCourseID = sCourseID;
    }
    
    public void setsTitle(String sTitle)
    {
        this.sTitle = sTitle;
    }

    public void setsFacultyID(String sFacultyID)
    {
        this.sFacultyID = sFacultyID;
    }

    public void setsRoom(String sRoom)
    {
        this.sRoom = sRoom;
    }

    public String getsCRN()
    {
        return sCRN;
    }
    public String getsFacultyID() 
    {
        return sFacultyID;
    }
    public String getsTitle()
    {
        return sTitle;
    }
    public String getsCapacity() 
    {
        return sCapacity;
    }
    public String getsTerm() 
    {
        return sTerm;
    }
    public String getsRoom()
    {
        return sRoom;
    }
    public String getnCreditHours()
    {
        return sCreditHours;
    }
    public String getsCourseID() 
    {
        return sCourseID;
    }
    
    
public void printSchedule(){
    String sScheduleFormatted = String.format("%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s", sCourseID, sCRN, sTitle, sTerm, sFacultyID, sRoom, sCapacity, sCreditHours);
        System.out.println(sScheduleFormatted);
}
    
}


public class Student1 {
    private String sStudentId;//variable to store the Student ID
    private String sFirstName;//variable to store the First Name
    private String sLastName;//variable to store the Last Name
    private String sStreet;//variable to store the Street
    private String sCity;//variable to store the City
    private String sState;//variable to store the State
    private int nZipCode;//variable to store the ZipCode
    private String sPhone;//variable to store the Phone
    private String sEmail;//variable to store the Email
    private int nMajorID;//variable to store the Major Id
    private String sExpectedGraduationDate;//variable to store the Expected Graduation Date
    
    
    //default constructor
    public Student1(){
        
    }
    //overloaded constructore
    public Student1(String sStudentId, String sFirstName, String sLastName, String sStreet, String sCity, String sState, int nZipeCode, String sPhone, String sEmail, int nMajorID, String sExpectedGraduationDate) {
        this.sStudentId = sStudentId;
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sStreet = sStreet;
        this.sCity = sCity;
        this.sState = sState;
        this.nZipCode = nZipeCode;
        this.sPhone = sPhone;
        this.sEmail = sEmail;
        this.nMajorID = nMajorID;
        this.sExpectedGraduationDate = sExpectedGraduationDate;
    }

    public String getsExpectedGraduationDate() {
        return sExpectedGraduationDate;
    }

    public void setsExpectedGraduationDate(String sExpectedGraduationDate) {
        this.sExpectedGraduationDate = sExpectedGraduationDate;
    }

    public String getsStudentId() {
        return sStudentId;
    }

    public void setsStudentId(String sStudentId) {
        this.sStudentId = sStudentId;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getsStreet() {
        return sStreet;
    }

    public void setsStreet(String sStreet) {
        this.sStreet = sStreet;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

    public String getsState() {
        return sState;
    }

    public void setsState(String sState) {
        this.sState = sState;
    }

    public int getnZipCode() {
        return nZipCode;
    }

    public void setnZipCode(int nZipCode) {
        this.nZipCode = nZipCode;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public int getnMajorID() {
        return nMajorID;
    }

    public void setnMajorID(int nMajorID) {
        this.nMajorID = nMajorID;
    }
    
    public void printStudent(){
        String sSudentFormatted = String.format("%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s%-24s", sFirstName, sLastName,sStreet, sCity, sState, nZipCode, sPhone, sEmail,nMajorID, sExpectedGraduationDate );
        System.out.println(sSudentFormatted);
        
        System.out.println("StudentId "+ sStudentId);
        System.out.println("Student name: "+ sFirstName + " "+ sLastName);
    }
    
}//end class Student

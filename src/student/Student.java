
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;
    public Student(String fName, String lname, String sID){
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getID(){
        return id;
    }
    public int getGrade(){
        return grade;
    }
    public void setFirstName(String fName){
        firstName = fName;
    }
    public void setLastName(String lname){
        lastName = lname;
    }
    public void setID(String sID){
        id = sID;
    }
    public void setGrade(int grd){
        grade = grd;
    }
    public void print(){
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}

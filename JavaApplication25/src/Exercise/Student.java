
package Exercise;
import java.util.Date;
public class Student {
    private String studentID;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;
    public Student(String studentID,String fullName,Date dateOfBirth,String major,float gpa ){
        this.studentID=studentID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }
    public Student(){
        
    }
    public String getstudentID(){
        return studentID;
    }
    public void setstudentID(String studentID){
        this.studentID = studentID;
    }
    public String getfullName(){
        return fullName;
    }
    public void setfullName(String fullName){
        this.fullName = fullName;
    }
    public Date getdateOfBirth(){
        return dateOfBirth;
    }
    public void setdateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getmajor(){
        return major;
    }
    public void setmajor(String major){
        this.major = major;
    }
    public float getgpa(){
        return gpa;
    }
    public void setgpa(float gpa){
        this.gpa = gpa;
    }
    public void displayStudentInfo() {
        System.out.println("Ma sinh vien: " + studentID);
        System.out.println("Ten sinh vien: " + fullName);
        System.out.println("Ngay sinh: " + dateOfBirth);
        System.out.println("chuyen nganh: " + major);
        System.out.println("GPA: " + gpa);
    }
     @Override
    public String toString() {
        return "Student{" + "studentId='" + studentID + '\'' + ", fullName='" + fullName + '\'' + 
               ", dateOfBirth=" + dateOfBirth + ", major='" + major + '\'' + ", gpa=" + gpa + '}';
    }
}

    
    


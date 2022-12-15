package AssignmentEncapsulation;

public class Student {
    Integer StudentID;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String studentPhone;


    public  Student(){

    }

    public Student(String firstName, String lastName,String studentEmail,String studentPhone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentEmail=studentEmail;
        this.studentPhone =studentPhone;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStudentEmail(){
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getStudentPhone(){
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
}

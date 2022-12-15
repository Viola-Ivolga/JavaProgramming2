package AssignmentEncapsulation;

public class AppClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentEmail("test@gmail.com");
        student.setStudentPhone("234-455-5676");
        student.setFirstName("Tom");
        student.setLastName("Smith");

        System.out.println(student.getStudentEmail());
        System.out.println(student.getStudentPhone());
    }
}

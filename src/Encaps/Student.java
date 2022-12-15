package Encaps;

public class Student {
    String firstName;
    String lastName;
    String major;
    double gpa;
    int age;
    boolean onProbation;


    public Student(String firstName, String lastName,String major, double gpa,int age,boolean onProbation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa =gpa;
        this.age=age;
        this.onProbation = onProbation;


}

    public boolean isOnHonorRoll() {
        if(this.gpa >= 3.5) {
            return true;
        }
        return false;
    }
    }


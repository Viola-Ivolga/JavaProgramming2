package Encaps;

public class Contractor1 {
    public static void main(String[] args) {
        Student myStudent = new Student("Jim","Super","Business",2.3,30,false);
        /*myStudent.firstName = "Jim";
        myStudent.lastName = "Super";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 30;
        myStudent.onProbation = false;*/




        Student myStudent2 = new Student("Lili","Lucky","Art",2.5, 30,true);
        /* myStudent2.firstName = "Lili";
        myStudent2.lastName = "Lucky";
        myStudent2.major = "Art";
        myStudent2.gpa = 2.5;
        myStudent2.age = 30;
        myStudent2.onProbation = true; */

        myStudent.age = 25;



        System.out.println(myStudent2.firstName);
        System.out.println(myStudent.age);
        System.out.println(myStudent.isOnHonorRoll());


        Book book1 = new Book("Harry Potter","JK Rowling",500,"English");

        Book book2 = new Book("Rose","Tom Bang",50,"German");

        book1.setLanguage("Chinese");
        book2.setLanguage("English");

        System.out.println(book1.getLanguage());
        System.out.println(book2.getTitle());
        System.out.println(book2.getLanguage());
    }


}

package PracticeJava;

import java.util.Scanner;

public class Practice2 {
    public static final double PI = 3.14159; // final cannot be reassigned.
    public static void main(String[] args){ //method
        String password = "12345";
        System.out.println("Guess the password: ");
        //input

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(password.equals(guess));


        //System.out.print("What is your name? Type here _____");

       // var x = new PracticeJava.Practice2(); // creating an object
        //x.tacos();

        //int x = 5; // primitive type

      //  Integer y = 5; //object type(5 is autoboxed)

        //System.out.println(x);
       // System.out.println(y);


        // type identifier = new type();
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        System.out.println("Hello " + name);

//
//        String str = new String("I just create a string!");
//        String easier = "Wow, that was easy!"+ " :) ";
//        System.out.println(str +" " + easier);
   // }

    //public void tacos(){ //method
        //System.out.println("Do you want Tacos?");
    }
}

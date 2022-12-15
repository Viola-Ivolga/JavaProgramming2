package PracticeJava;

import java.util.Scanner;

public class Practice4 {

    public static String myLove(){
        String str = "Hello World";
        String newStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            newStr += str.charAt(i);
        }
//        System.out.print(newStr);
        return newStr;
    }

        public static void main(String[] args) {

        String name = "Clare";
       // boolean welcome = name.equals("Clare") ? true : false;
           // System.out.println(name);
           // int welcome = name.equals("Clare") ? 5 : 10;

        /*
        System.out.println("What's your name? ");

        Scanner scan = new Scanner (System.in);
        String name =scan.nextLine();
        switch (name){
            case "Vita":
                System.out.println("Welcome in!");
                break;
            case "Mat":
                System.out.println("go away");
                break;
            default:
                System.out.println("Try again");
                break;

        }

         */
            //System.out.print(myLove());

           /* System.out.println("How old are you?");
            Scanner scan = new Scanner(System.in);
            int age = Integer.parseInt(scan.nextLine());
            System.out.println("Cats or dogs");
            String animal = scan.nextLine();


            if(age>12 && animal.equals("dogs"))
            {
                System.out.println("Welcome!");
            }

            */



        }
    }


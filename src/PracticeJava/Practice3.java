package PracticeJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        String password = "12345";
        System.out.println("Guess the password: ");
        //input

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        //System.out.println(password.equals(guess)); //checking the password is correct or not

        if (password.equals(guess))
        {
            System.out.println("Your guess was correct!");
        }else{
            System.out.println("Password incorrect. Try again");
        }



       /* String r = " my oh my chicken pie";

        System.out.println(r.charAt(r.length() -9)); // take only one character from the string
        String fullAdd = r + " now with 20% discount"; // adding strings together or use concat key word
        System.out.println(fullAdd.toUpperCase());
        System.out.println(fullAdd.strip()); //removes the spaces from the string

        System.out.println(fullAdd.substring(10,17)); //take the specific range of characters from the string

        System.out.println(fullAdd);
        System.out.println(fullAdd.contains("chicken")); //checking of string contains the word
        System.out.println(fullAdd.indexOf("my")); // find index of the word in a string
        System.out.println(fullAdd.indexOf("my",fullAdd.indexOf("my") + 1));
        System.out.println(fullAdd.lastIndexOf("my"));
        String q = "Hello"; // object (instance of the class)
        q.charAt(0); // method work with index
*/

//        String name = "Vita";
//        System.out.println(String.format("Hello %s", name));
//        System.out.println(name.length());


      //JavaMethods.Methods
//          int x = 10;
//          int y = 20;


//        System.out.println(Integer.max(x,y));
//        System.out.println(Integer.compare(x,y));
//
//        String money = "300"; // convert string to int
//        Integer a = Integer.valueOf(money); // storing objects
//        int b = Integer.parseInt(money);    // storing primitive data type
//
//        System.out.println(Integer.valueOf(money));
//        System.out.println(Integer.parseInt(money));




//        int a = 5;
//        double x = a / 2;
//        double y = (double) a/ 2;
//        System.out.println(x);
//        System.out.println(y);
//
//        System.out.println(Math.pow(-99999, 999999999));
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.SIZE);
       // Scanner scan = new Scanner(System.in);

//        boolean x = scan.nextBoolean();
        //int x = (int)scan.nextDouble(); // down casting
       // System.out.println(x);
//        String x = scan.nextLine();
//        System.out.println(x);
//        int y = scan.nextInt();
//        System.out.println(y);
//        int a = y + 10;
//        System.out.println(a);
//        BigDecimal money = scan.nextBigDecimal();
    }
}

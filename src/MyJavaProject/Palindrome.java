package MyJavaProject;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Write a word: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for(int i = 0; i<str.length()/2;i++){
            //System.out.println(str.charAt(i) + " = " + str.charAt(str.length() - 1 - i));
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                System.out.println("NOT A PALINDROME");
                return;
            }
        }
        System.out.println("PALINDROME");
    }
}

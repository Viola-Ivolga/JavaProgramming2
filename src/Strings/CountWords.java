package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.trim().split(" ");  // How this line works?
        System.out.println("Number of words in the string = " + words.length);

        System.out.println("********************************");


        System.out.println("Enter the text : ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        int count =1; // Why we start with 1 instead of 0?
        for(int i = 0; i < s1.length()-1; i++){
            if((s1.charAt(i) == ' ') && (s1.charAt(i+1) != ' '))
            {
                count++;
            }
        }

        System.out.println("Number of words in a sentence = " + count);
    }
}

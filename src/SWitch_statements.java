import java.util.*;
public class SWitch_statements {
    public static void main(String[] args)
    {
        System.out.println("Lets Play");
        System.out.println("Enter any of the options given below");
        System.out.println("Press 1:- Ride a cat");
        System.out.println("Press 2:- Jump from your balcony and don't die");
        System.out.println("Pres 3:- Good Luck");
        System.out.println("Press 4:- Merry CHristmas");
        Scanner sc = new Scanner(System.in); // keyboard
       // Scanner sc = new Scanner(violett.txt); // violett.txt
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Cat is running away");
                break;
            case 2:
                System.out.println("I am Superman");
                break;
            case 3:
                System.out.println("lets see");
                break;
            case 4:
                System.out.println("Santa Claus");
                break;
            default:
                System.out.println("enter the correct choice yooooo");

        }




    }
}

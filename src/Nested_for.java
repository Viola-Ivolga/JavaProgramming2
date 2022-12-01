









//import java.util.Scanner;
//public class Nested_for
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        for (int i = rows - 1; i>=0; i--)
//        {
//            for (int j = 0; j<= i; j++)
//            {
//                System.out.print(" ");
//                System.out.print("*" );
//            }
//            System.out.println();
//        }
//        sc.close();
//    }
//}






// *********************      *********************

//import java.util.Scanner;
//public class Nested_for
//{
//    public static void main(String args[])
//    {
//        int n, i, j, space = 1;
//        System.out.print("Enter the number of rows: ");
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        space = n - 1;
//        for (j = 1; j<= n; j++)
//        {
//            for (i = 1; i<= space; i++)
//            {
//                System.out.print(" ");
//            }
//            space--;
//            for (i = 1; i <= 2 * j - 1; i++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        space = 1;
//        for (j = 1; j<= n - 1; j++)
//        {
//            for (i = 1; i<= space; i++)
//            {
//                System.out.print(" ");
//            }
//            space++;
//            for (i = 1; i<= 2 * (n - j) - 1; i++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//   }
//}


//***************** java: cannot find symbol ************* // home work
//public class Nested_for
//{ public static void Nested_for(int n)
//{
//    for (int i = 0; i < n; i++) {
//        System.out.print(" ");
//
//        for (int j = 0; j <= i; j++) {
//            System.out.print("* ");
//            System.out.print(" ");
//        }
//
//
//        System.out.println();
//    }
//}
//    public static void main(String args[]) {
//        int n = 5;
//        Nested_for(n);
//    }
//}








//public class Nested_for {
//    public static void main(String[] args) {
//        for(int i=7;i>0;i--)
//        {
//
//            for(int j=i;j>0;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//}
//****   i=4 , j=4
//***    i=3 , j=3
//**     i=2 , j=2
//*
//public class Nested_for {
//    public static void main(String[] args) {
//        for(int i=0;i<7;i++)
//        {
//
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//}
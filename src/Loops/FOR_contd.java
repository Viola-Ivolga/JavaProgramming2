package Loops;

public class FOR_contd {
    public static void pyramidPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" "); //print space
            }
            for (int j = 0; j <= i; j++) //inner loop for number of columns
            {
                System.out.print("* "); //print star
            }

            System.out.println(); //ending line after each row
        }
    }

    public static void main(String args[]) //driver function
    {
        int n = 5;
        pyramidPattern(n);
    }
}






//public class FOR_contd {
//
//    public static void main(String[] args) {
//        //arrays , strings
//        int row=5, col =5;
//        for(int i=0;i<5;i++)//rows
//        {
//            //space
//            for(int j=row-1;j>(0+i);j--)
//            {
//                System.out.print("_");
//            }
//            //stars
//            for(int k=0;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//
//            //second star
//            for(int l=0;l<i;l++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//    }
//}
//    *
//   **
//  ***
// ****
//*****
//rows =5 col =5 space =4

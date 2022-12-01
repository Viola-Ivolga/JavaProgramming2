





// ************Home work #2 ***************** //

public class For_loops {
    public static void main(String[] args) {
        int a = 5;
        for (int b = 1; b < a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c < b; c++) {
                System.out.print("* ");
            }
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");
            }
            System.out.println();}

        for (int b = 1; b <= a; b++) {
            for (int c = a; c >= b; c--) {
                System.out.print("  ");
            }
            for (int c = b; c < a; c++) {
                System.out.print("* ");
            }
            for (int c = b; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
    }
}}







//public class For_loops {
//    public static void main(String[] args) {
//        for(int i = 0; i <= 7;i++ )
//        {
//
//            for (int j = 0; j < i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


//public class For_loops {
//    public static void main(String[] args) {
//
//
//       for( int j=0;j<=5;j++)
//        {
//            System.out.println(j);
//        }
//
//        System.out.println(".......................");
//
//        int i=0;
//        for(;i<=5;i++)
//        {
//            System.out.println(i);
//        }
//    }
//}

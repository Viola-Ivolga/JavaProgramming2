public class First {
    public static void main (String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = i; j<= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int b = 1; b <= n; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("  ");
            }
            for (int c = b; c <= n; c++) {
                System.out.print("* ");
            }
            for (int c = b; c < n; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }}





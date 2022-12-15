package Loops;//***************** My homework #1 ****************** //


public class Second {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print("  ");
            }
            for (int s = 1; s <= n; s++) {
                System.out.print("* ");
            }
            for (int k = i; k < n; k++)
            {
                  System.out.print("  ");
            }
            for(int k = i; k < n; k++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <=n; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
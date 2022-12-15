package JavaMethods;

import java.util.*;
public class Methods {


    public static void Even(int n)
    {

        if(n%2==0)
        {
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int [] input = {2,3,1,5,2,72,853,48,2,5753,893,5823,7};
        for(int i=0;i<input.length;i++)
        {
            Even(input[i]);
        }

    }




}

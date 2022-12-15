package Arrays;

public class Array_2d {
    public static void main(String[] args) {
        int [] arr = new int[5]; // 1-d array
        int [][] arr2 = new int[3][5]; // 2-d array
//        arr2[0][0] = 10;
//        arr2[1][0] = 20;
       int [][]arr3 = {{1,2,3},{4,5,6},{7,8,9},{2,3,4},{5,6,8}};
        for(int i=0;i<5;i++) //main array
        {
            for(int j=0;j<3;j++) // inner one
            {
               // System.out.println(i+" "+j);
                arr3[i][j] = arr3[i][j]+10;
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

        int [][] arr4 = arr3;//copying
       // int[][][][][] arr5 = new int[][][][][];



    }
}

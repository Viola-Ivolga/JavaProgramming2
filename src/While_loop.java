public class While_loop {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
//        for(int i=0;i<5;i++) // starting point & ending point
//        {
//            System.out.println(arr[i]);
//        }
//        System.out.println("..................................");
//        for(int i: arr)
//        {
//            System.out.println(i);
//        }

        int i=0;
        while(i<5)
        {
            int k=5;
            while(k>(i+1))
            {
                System.out.print(" ");
                k--;
            }

            int j=0;
            while(j<i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

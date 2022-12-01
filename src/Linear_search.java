public class Linear_search{
        public static void main(String[] args) {
        int [] A = {11,12,13,14,15,16,17,18,19,10};
        int number =15;
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == number)
            {
                System.out.println(i);
            }

        }
    }
}

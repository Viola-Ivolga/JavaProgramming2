public class Binary_search {
    public static void main(String[] args) {
        int [] binary = {11,12,13,14,16,45,67,87};
        int number = 90;
        int start = 0 , end = binary.length-1 ;

        while(true)
        {
            if(binary[binary.length-1]<number || binary[0]>number  )
            {
                System.out.println("number not found");
                break;
            }
           int  mid = (start+end)/2;

            if(start >=end )
            {
                System.out.println("number not present");
                break;
            }

            //int mid = (start+end)/2;
            else if(binary[mid] == number)
            {
                System.out.println("number found");
                break;
            }

            else if (number > binary[mid])
            {
                start = mid+1;

            }

            else if(number < binary[mid])
            {
                end= mid-1;

            }




        }

    }
}

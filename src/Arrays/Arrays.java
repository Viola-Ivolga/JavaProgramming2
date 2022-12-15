package Arrays;

public class Arrays {
    public static void main(String[] args) {
        //Python is high level language :- Programmer friendly :- slow 2s
        // Java is Assembly level language :- Machine friendly :- fast 0.6s
        // C :- Low level language :- 0.1s
        int a = 10;
        int b = 20;
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        System.out.println(arr[4]);

    }

    public Arrays() {


        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + 100;
            System.out.println(arr2[i]);
        }

        int[] arr3 = arr2;


        System.out.println(arr2);
    }
}


package Generics;

public class Main {
    public static void main(String[] args) {
        Integer[]intArray = {1,2,3,4,5};
        Double[]doubleArray = {5.5,4.4,3.3,2.2,1.1};
        Character[] charArray ={'H','E','L','L','0'};
        String[] stringArray = {"B","Y","E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));


    }
    // for not creating methods for each individual data types
    // I am using generic, that can handle all the data types that I need to pass.
    //instead of using Integer key-word I am using <T> and it can take any type of data
    // 1 version of generic for all reference data types!
    public static <T> void displayArray(T[] array) {   //generic method displaying the whole array list
        for(T x : array) {
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array){ // generic method getting only first element from the array
        return array[0];
    }
}

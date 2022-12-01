import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        // ********* declaring array in 1 line *******//

        char vowels[] = {'e','x','i','u','o','a'};


        // ******** declaring array by index within 5 ********//

        // char vowels[] = new char[5];

        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        // ******* sorting array ********* //
        // int startingIndex = 1;
        // int endingIndex = 4;

        // Arrays.sort(vowels,startingIndex, endingIndex);

        //*******replace with new string*********//

        // vowels[2] = 'x';


        int startingIndex = 1;
        int endingIndex = 4;

        // ****** found item index **********//

        char key = 'o';

        Arrays.fill(vowels,startingIndex, endingIndex, 'x');

        // System.out.println(itemIndex);

        // ***********//

        System.out.println(Arrays.toString(vowels));

        // *******length of the array *******//

        // System.out.println(vowels.length);

    }
} 
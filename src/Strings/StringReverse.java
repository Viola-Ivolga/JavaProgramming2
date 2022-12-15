package Strings;

public class StringReverse {
    public static void main(String[] args) {
//        StringBuffer sbf = new StringBuffer("MyJava"); // Using StringBuffer class
//        System.out.println(sbf.reverse());


        System.out.println("********************************");

        String str = "voilett"; // Using iterative method
        char[] orgArr = str.toCharArray(); //voilett
        char[] strArray = str.toCharArray();
        boolean result = true;
        for(int i = strArray.length - 1; i >= 0; i--)//tteliov
        {
            int j=0;

            if(strArray[i] != orgArr[j])
            {
                result=false;
            }
            j++;

        }
        if(result == true)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a  pali");
        }



        System.out.println("\n"+ "********************************");

//        System.out.println(recursiveMethod(str));
//    }
//
//    static String recursiveMethod(String str) {
//        if ((null == str) || (str.length() <= 1)) {
//            return str;
//        }
//        return recursiveMethod(str.substring(1)) + str.charAt(0);}
    }}


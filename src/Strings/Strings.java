package Strings;

public class Strings {
    public static void main(String[] args) {
//        char abc = 'a'; //primitive data type
//        char [] name = {'v','i','o'}; name[0]   name.length
        String name = "Violeotot"; //Non_Primitive Data type //length=7
//        //  name.charAt(2)
//        for (int i = 0; i < name.length(); i++) {
//
//            System.out.println("character :- " + name.charAt(i));
//
//        }
//
//        String talent = "smart";
//        String add = talent+' '+name;
//        System.out.println(add);
//        System.out.println(name.concat("  "+talent));
//        System.out.println(name.indexOf("y"));
//        String [] arr  = name.split("o" , 2 );
//        for(String a : arr)
//        {
//            System.out.println(a);
//        }
        String a ="25";
        String b = "a";
        // Integer.parseInt(a)
        System.out.println(Integer.parseInt(a));
        int c =45;

        String d =String.valueOf(c);
        System.out.println(d instanceof java.lang.String);

        System.out.println("**********************");


        String str1 = "JAva";
        String str2 = "";

        System.out.println(str1.length());
        System.out.println("Learn Java\n".length());
        System.out.println("*************************");

        String s1 = "Study";
        String s2 = "Hello";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isBlank());

        System.out.println("******************");

        System.out.println(s2 + " how are you?");
        System.out.println(str1.trim()+" how are you?");



        System.out.println("**********************");

        String s1lower = s1.toLowerCase();
        System.out.println(s1lower);





    }}

package PracticeJava;

import java.io.*;

public class KBA {
    public static void main(String[] args) {
     int x=4;
     int y =0;
     for(;y<12;++y){
         if(y%x ==0)
             continue;
         else if (y ==8)
             break;
         else{
             System.out.print(y+" ");
             }}
        System.out.print("*******************");

         int r = 2;
         int e = 0;
         for(;e<10; ++e){
             if(e % r == 0)
                 continue;
             else if(e ==8)
                 break;
             else{
                 System.out.print(e + " ");
             }
         }

         }
     }


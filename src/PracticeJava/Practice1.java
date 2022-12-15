package PracticeJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
    public static class Solution{
    int findMaximum(int[] arr, int n) {
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                return arr[i];
        }

        return arr[n-1];
    }
}}


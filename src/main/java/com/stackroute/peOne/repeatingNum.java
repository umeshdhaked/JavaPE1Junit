package com.stackroute.peOne;
import java.util.Scanner;

public class repeatingNum {


    public static String fun(int n) {

    /*    System.out.println("4. repeating n number n times :");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
*/
        String ans="";

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
               // System.out.print(i + " ");
                ans=ans+i;
            }


        }
        return ans;
    }



}

package com.stackroute.peOne;
import java.util.Scanner;

public class unspecifiedNumber {

    public static int fun(String inputStr) {
/*
        System.out.println("5. unspecified Number till Character:");

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        */

        String[] numString = inputStr.split(" ");

        int sum = 0;

        int i = 0;
        int d=0;

        boolean flag = true;

        while (flag) {

            try {
                d = Integer.parseInt(numString[i]);
            }
            catch (NumberFormatException nfe) {
                // System.out.println(nfe.toString());
                flag = false;
            }
            if (flag) {
                sum = sum + d;

            }
            i++;

        }


       // System.out.println("sum = " + sum);

        return sum;

    }

}
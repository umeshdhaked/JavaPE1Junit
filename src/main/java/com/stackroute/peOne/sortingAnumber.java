package com.stackroute.peOne;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class sortingAnumber {

    public static String fun(int num) {
/*
        System.out.println("7. sorting A number :");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
*/

        Vector<Integer> v = new Vector<Integer>();

        while (num != 0) {
            v.add(num % 10);
            num = num / 10;
        }

        Collections.sort(v);

      //  System.out.print("Sored number in non-increasing order is : ");

        int sum = 0;

        String str = "";
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 == 0) {
                sum = sum + v.get(i);
            }
      //      System.out.print(v.get(v.size()-i-1));
            str=str+v.get(v.size()-i-1);

        }

        int ans = Integer.parseInt(str);


      //  System.out.println("sum = "+sum);

        if(sum>15)
            str=str+"true";
           // System.out.println("true");
        else
            str=str+"false";
            //System.out.println("false");




        return str;

    }



}

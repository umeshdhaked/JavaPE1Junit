package com.stackroute.peOne;
import java.util.Scanner;

public class TomJerry {


    public static String fun(int input) {
    /*    System.out.println("2. Tom Jerry :");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

*/

        if (input > 20 && input < 30) {
            if (input % 2 == 0)
                return "Jerry";
                //System.out.println("Jerry");
            else
                return "Tom";
               // System.out.println("Tom");
        }

        return null;
    }


}

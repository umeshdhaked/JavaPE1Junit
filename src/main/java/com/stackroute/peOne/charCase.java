package com.stackroute.peOne;

import java.util.Scanner;

public class charCase {



    public static String fun(char input) {
/*
        System.out.println("6. check character case :");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
*/
        char ch = input;

        if(ch>='A' && ch<='Z'){
           return "Capital letter";
        }
        else if(ch>='a' && ch<='z'){
           return "Small letter";
        }
        else if(ch>='0' && ch<='9'){
            return "It's a Number";
        }
        else{
           return "Special Symbol";
        }




    }



}

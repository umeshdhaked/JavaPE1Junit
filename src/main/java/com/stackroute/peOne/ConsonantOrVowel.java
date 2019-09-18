package com.stackroute.peOne;
import java.util.Scanner;

public class ConsonantOrVowel {



    public static String  fun(String input){

       // System.out.println("3. Consonant Or Vowel :");

    //    Scanner sc = new Scanner(System.in);
        String str = input;


        char ch;

        String ans="";

        for( int i=0;i<str.length();i++) {
            if ((str.charAt(i) > 'a' && str.charAt(i) < 'z') || (str.charAt(i) > 'A' && str.charAt(i) < 'Z')) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    ans=ans+str.charAt(i)+"-Vowel ";
                } else {
                    ans=ans+str.charAt(i)+"-Consonant ";
                }

            }
            else{
                ans=ans+str.charAt(i)+"-not a char ";
            }

        }

return ans;

    }


}

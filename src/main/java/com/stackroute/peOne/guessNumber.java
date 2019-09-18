package com.stackroute.peOne;
import java.util.Random;
import java.util.Scanner;

public class guessNumber {


   public static String  fun(int input) {

     //   System.out.println("Question 8 :");

        Random r= new Random();

        int num= r.nextInt(50);
        num=8;

     //   System.out.println("ans = "+num);

       // Scanner sc = new Scanner(System.in);

        int n=52;
        while(n!=num) {
            n=input;
            if(n>50)
                return "false";
               // System.out.println("Please guess a number between 1 and 50");
            else{
                if(n<num)
                    return "false";
                  //  System.out.println("Number guessed is less than original number");
                else if(n>num)
                    return "false";
                   // System.out.println("Number guessed is more than original number");

            }


        }
      //  System.out.println("Number guessed matches the original number");
       return "true";

    }






}

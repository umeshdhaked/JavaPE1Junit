package com.stackroute.peOne;

import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class testOne {

    @Test
    public void charCase(){

        charCase obj = new charCase();

        String result = obj.fun('G');

        assertEquals("Capital letter",result);

        result = obj.fun('v');

        assertEquals("Small letter",result);

    }
    @Test
    public void consonantOrVowel(){

        ConsonantOrVowel obj = new ConsonantOrVowel();

        String result = obj.fun("ume1sh");

        assertEquals("u-Vowel m-Consonant e-Vowel 1-not a char s-Consonant h-Consonant ",result);

    }

    @Test
    public void guessNumber(){
        guessNumber obj = new guessNumber();
        String result = obj.fun(8);


        assertEquals("true",result);

        result = obj.fun(10);

        assertEquals("false",result);


    }


    @Test
    public void integerPalindrome(){
    integerPalindrome obj = new integerPalindrome();
    int result= obj.fun(1234321);


    assertEquals(1234321,result);

    }

    @Test
    public void repeatingNum(){
        repeatingNum obj = new repeatingNum();
        String result = obj.fun(5);

        assertEquals("122333444455555",result);

    }
    @Test
    public void repeatStringEnd(){
        repeatStringEnd obj = new repeatStringEnd();
        String result = obj.fun("umesh",3);


        assertEquals("umeshesheshesh",result);

    }

    @Test
    public void reverseString(){

        String result = reverseString.fun("HelloWorld");   // Because fun is a static method

        assertEquals("dlroWolleH",result);


    }

    @Test
    public void sortingANumber(){
        String result1 = sortingAnumber.fun(524234);

        assertEquals("544322false",result1);

    }

    @Test
    public void tomJerry(){
        String result = TomJerry.fun(25);

        assertEquals("Tom",result);

        result=TomJerry.fun(50);

        assertEquals(null,result);


    }
@Test
    public void unspecifiedNumber(){
        int result = unspecifiedNumber.fun("2 4 34 23 46 A 434 6 2222");

        assertEquals(109,result);


    }







}

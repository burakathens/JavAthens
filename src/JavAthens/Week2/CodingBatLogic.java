package JavAthens.Week2;

import java.util.Arrays;

public class CodingBatLogic {

    public static void main(String[] args) {







        /* Q1
        Given three ints, a b c, return true
        if it is possible to add two of the ints to get the third.

        twoAsOne(1, 2, 3) → true
        twoAsOne(3, 1, 2) → true
        twoAsOne(3, 2, 2) → false
        */

        System.out.println("TwoAsOne ornegi\n-----------");
        System.out.println(twoAsOne(4, 5, 9));
        System.out.println(twoAsOne(3, 1, 5));
        System.out.println(twoAsOne(23, -1, 22));


        //Q2
        //Given an int n, return the string form of the number followed by "!".
        // So the int 6 yields "6!".
        // Except if the number is divisible by 3 use "Fizz" instead of the number,
        // and if the number is divisible by 5 use "Buzz",
        // and if divisible by both 3 and 5, use "FizzBuzz".
        // Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
        // What will the remainder be when one number divides evenly into another?
        // (See also: FizzBuzz Code and Introduction to Mod)
        //
        //System.out.println("FizzOrnegi\n-------------");
        //        System.out.println(fizzString2(14));
        //        System.out.println(fizzString2(15));
        //        System.out.println(fizzString2(5));
        //        System.out.println(fizzString2(3));
        //        System.out.println(fizzString2(7));
        //fizzString2(1) → "1!"
        //fizzString2(2) → "2!"
        //fizzString2(3) → "Fizz!"


    }

    public static String fizzString2(int n) {
        if(n%3==0&&n%5==0){
            return "FizzBuzz!";

        }
        else if(n%3==0){
            return "Fizz!";
        }else if(n%5==0){
            return "Buzz!";
        }
        else return n+"!";

    }

    public static boolean twoAsOne(int a, int b, int c) {
       int aa[]={a,b,c};
       Arrays.sort(aa);
       //aa 1 2 3
       if(a+b==c){
           return true;
       }else return false;
    }



}

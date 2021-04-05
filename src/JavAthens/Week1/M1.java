package JavAthens.Week1;

import java.util.Arrays;

public class M1 {
    public static void main(String[] args) {
        //Given a string, return a new string where the first and last chars have been exchanged.
        //frontBack("code") → "eodc"
        //frontBack("a") → "a"
        //frontBack("ab") → "ba"

        System.out.println(Arrays.toString(makePi()));

          String s="code";
          String s2="javaThens";


        System.out.println(frontBack(s));
        System.out.println(frontBack(s2));
        int i=123456;
        String s3="123456";
        System.out.println(frontBack(Integer.toString(i)));
        //
        //System.out.println(Integer.toBinaryString(i));
        System.out.println(extraEnd("Hello"));

    }




    public static String extraEnd(String str){
        //Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
        // The string length will be at least 2.
        //
        //
        //extraEnd("Hello") → "lololo"
        // H E L L O
        // 0 1 2 3 4 indis
        //str.length() >>5dir
        //extraEnd("ab") → "ababab"
        //extraEnd("Hi") → "HiHiHi"
        String s1= str.substring(str.length()-2);
       return  s1+s1+s1;
    }

    //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    public static int[] makePi(){
        //{3,1,4}
        int[] pi={3,1,4};
        //System.out.println(Arrays.toString(pi));

        return pi;
    }

    public static String frontBack(String str){



       /* char c1=str.charAt(0);
        char c2=str.charAt(str.length()-1);
        String son="";
        son.concat(String.valueOf(c2));
        son.concat(str.substring(1,str.length()-1));
        son.concat(String.valueOf(c1));
        System.out.println(son);*/
        return str.substring(str.length()-1)+str.substring(1,str.length()-1)+str.substring(0,1);
    }
}

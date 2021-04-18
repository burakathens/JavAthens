package JavAthens.Week2;

import java.util.ArrayList;
import java.util.Arrays;

public class logic2 {
    public static void main(String[] args) {
/*
*
* Given three ints, a b c, return true if two or more of them have the same rightmost digit.
* The ints are non-negative.
*  Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
* lastDigit(23, 19, 13) → true
* lastDigit(23, 19, 12) → false
* lastDigit(23, 19, 3) → true
* */
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(21, 19, 13));


        int [] aa={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        System.out.println(Arrays.toString(TekrariSil(aa)));

        /*Given three ints, a b c, return true if b is greater than a, and c is greater than b.
        However, with the exception that if "bOk" is true, b does not need to be greater than a.

*/
        inOrder(1, 2, 4, false); //→ true
        inOrder(1, 2, 1, false);//→ false
        inOrder(1, 1, 2, true); //→ true

        /* ODEV
        * verilen 2 int degerinin onlar basamagındaki sayılar esitse true
        * degilse false donduren onlukDigit isimli methodu yazınız.
        * not. % mod kullanacaksınız :)
        *  onlukDigit(45,43) >> true
        *  onlukDigit(62,23) >> false
        *  onlukDigit(23,324) >> true
        *  onlukDigit(123,456) >> false
        *
        * public static boolean onlukDigit (int a, intb){
        *
        * }
        *
        * */



    }
    public static boolean lastDigit(int a, int b, int c) {
        if((a%10==b%10)||(a%10==c%10)||(b%10==c%10)){
            return true;
        }
        else return false;
    }


    public static boolean inOrder(int a, int b, int c, boolean bOk) {

        if(bOk){
            if(c>b){
                return true;
            }else return false;
        }
        if (b>a && c>b){
            return true;
        }else return false;
    }
    public static int [] TekrariSil(int [] dizi){
        //int [] aa={1,2,2,3,1,4,2,5,6,8,7,5,9,1};

        ArrayList<Integer> list=new ArrayList();
        for(int i:dizi){
            if(!list.contains(i))
            list.add(i);
        }
        int[] b = new int[list.size()];

        for(int a=0;a< list.size();a++){
              b[a]= list.get(a);
              //b[0]=list 0 indisli elemanı
            //b[8]= list son elemanı
        }
        return b;
    }

}

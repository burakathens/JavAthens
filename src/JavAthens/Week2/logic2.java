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
        System.out.println("----------");
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
        * public static boolean onlukDigit (int a, int b){
        *
        * }
        *
        * */

        System.out.println("----");
        System.out.println(onlukDigit(123, 456));
        System.out.println(onlukDigit(123, 324));


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




        //int [] aa={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        for(int i:dizi){
            if(!list.contains(i))
            list.add(i);
            /*
            * listeninbirinci lemanı icin once i=1 olacak
            * list.contains(1) >> listede 1 sayısı varmı? demek
            * ! işareti yazılanın tersinin alır yani
            * !list.contains(1) >> 1 sayısı yok mu?  not contains?
            * liste basta bos o yuzden 1 sayısı icinde yoktur
            * if bana ne diyecek? true donecek?? if li code blogu calıssın demek
            * list.add(1)>> listemiz bir elemanlı bir listedir
            * iknci asama i=2 sonra tekrar 2 vs....
            * ------------
            * ikinci 2 sayısı icin
            * !list.contains(2) >> listede 2 sayısı varmı? (suan var)
            *  dongu dizinin son elamanına kadar devam eder...
            * */
        }
        int[] b = new int[list.size()];
        // liste size i foreach dongusu sonrası belli olur bu ornek kapsamında 9dur
        // b={0,0,0,0,0,0,0,0,0}

        for(int i=0;i< list.size();i++){
              b[i]= list.get(i);
              //b[0]=list 0 indisli elemanı
            //b[8]= list son elemanı
        }
        //b={1,2,3,4,5,6,7,8,9}

        return b;
    }
    public static boolean onlukDigit (int a, int b){
        int aa=(a%100)/10;
        int bb=(b%100)/10;
        if(aa==bb){
            return true;
        }
        else return false;

    }

}

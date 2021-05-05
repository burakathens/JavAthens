package JavAthens;

import java.util.Arrays;

public class Gulsen {
    public static void main(String[] args) {

        int a[] = {5,11,9};
        System.out.println(Arrays.toString(rotateleft(a)));

      /*  Given an array of ints length 3, return an array with the elements
       "rotated left" so {1, 2, 3} yields {2, 3, 1}.



        rotateLeft3([1, 2, 3]) → [2, 3, 1]
        rotateLeft3([5, 11, 9]) → [11, 9, 5]
        rotateLeft3([7, 0, 0]) → [0, 0, 7]
        */

    }

    public static int [] rotateleft (int [] dizi) {
        int dizi2[] = {0, 0, 0};
        // [5,9,11] ==> [9,11,5]
        if (dizi.length == 3) {
            dizi2[0] = dizi[1];
            dizi2[1] = dizi[2];
            dizi2[2] = dizi[0];
            return dizi2;

        }
        else return dizi2;
    }
}

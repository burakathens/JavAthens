package week3_1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rotateLeft {
    public static void main(String[] args) {

        //  Given an array of ints length 3, return an array with the elements "rotated left"
        //  so {1, 2, 3} yields {2, 3, 1}.


    }

    public static int[] rotateLeft3(int[] nums) {
        int[] arr1 = new int[3];
        arr1[0] = nums[1];
        arr1[1] = nums[2];
        arr1[2] = nums[0];


        return arr1;
    }
}
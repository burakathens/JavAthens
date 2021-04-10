package JavAthens.Week2;

public class CodinBatArrays {
        public static void main(String[] args) {
            //Q1
            //Given an array of ints, return true if 6 appears as either the first or last element in the array.
            // The array will be length 1 or more.
            //
            //
            //firstLast6([1, 2, 6]) → true
            //firstLast6([6, 1, 2, 3]) → true
            //firstLast6([13, 6, 1, 2, 3]) → false

            int [] a={1,2,6};
            int [] b={6,1,2,3};
            int[] c={3, 6, 1, 2, 3};
            int d[]={1, 2, 1};
            int[] e={};

      /*  System.out.println(firstLast6(a));
        System.out.println(firstLast6(b));
        System.out.println(firstLast6(c));*/

            //Q2
            //Given an array of ints, return true if the array is length 1 or more,
            // and the first element and the last element are equal.
            //
            //
            //sameFirstLast([1, 2, 3]) → false
            //sameFirstLast([1, 2, 3, 1]) → true
            //sameFirstLast([1, 2, 1]) → true

            System.out.println(sameFirstLast(d));
            System.out.println(sameFirstLast(a));
            System.out.println(sameFirstLast(c));
            System.out.println(sameFirstLast(e));






            // ÖDEV
            //Q3
            //Given 2 arrays of ints, a and b,
            // return true if they have the same first element or they have the same last element.
            // Both arrays will be length 1 or more.
            //
            //
            //commonEnd([1, 2, 3], [7, 3]) → true
            //commonEnd([1, 2, 3], [7, 3, 2]) → false
            //commonEnd([1, 2, 3], [1, 3]) → true


        }



        //method olusturma

        //f(x)=y fonksiyonunda oldugu gibi
        //y nin tipi bize cıktı tıpıdir ve belirtilmelidir ex boolean int etc.
        //  public static boolean   firstLast6(int[] nums){
        //              cıktı tipi  isim(girdileri)
        //
        //
        //        return false;
        //    }

        public static boolean firstLast6(int [] sayidizisi){
            if(sayidizisi[0]==6 || sayidizisi[sayidizisi.length-1]==6){
                return true;
            }
            else return false;
        }


        public static boolean sameFirstLast(int[] a){
            if(a.length>=1 && a[0]==a[a.length-1]){
                return true;
            }else return false;


        }

    }




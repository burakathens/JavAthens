package JavAthens.Week3;

import JavAthens.Week3.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class foreach_ve_arraylist {


    public static void main(String[] args) {

        ArrayList<Student> studentArrayList=new ArrayList<>();
        Student std1=new Student("mehmet");
        Student std2=new Student("hasan");
        Student std3=new Student("okan");
        Student std4=new Student("burak");
        Student std5=new Student("elif");
        Student std6=new Student("hazal");
        Student std7=new Student("ceren");
        System.out.println(std7.isim);



        studentArrayList.add(std1);
        studentArrayList.add(std2);
        studentArrayList.add(std3);
        studentArrayList.add(std4);
        studentArrayList.add(std5);
        studentArrayList.add(std6);
        studentArrayList.add(std7);

        //{mehmet,hasan,okan,burak}
        // 0       1     2    3


        //foreach

        for(Student s:studentArrayList){
        //buradaki kodu her bir s elemanı icin yaap
            System.out.println("ben "+s.getIsim()+" isimli ogrenciyim");

        }
        int telsyc=1234;
        for (Student s:studentArrayList){
            //her ogrenciye telno olarak 12345 atasın
            s.setTelno(telsyc);
            telsyc=telsyc+2;
            System.out.println(s.getIsim() + " isimli orrencinin telefonu " + s.getTelno() + " dır.");
        }

        /*for (Student s:studentArrayList){

            System.out.println(s.getIsim() + " isimli orrencinin telefonu " + s.getTelno() + " dır.");
        }*/




         /*


        * for(Student s:oglist){
        * s.NuramaKayit();
        *
        * }
        *
        * */

    }


}

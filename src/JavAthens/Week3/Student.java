package JavAthens.Week3;

import java.util.ArrayList;

public class Student {
    //properties ozellklerimiz
    int telno;
    String isim;
    ArrayList adreslist;

//constructor
    public Student() {
    }

  public  Student(String isim) {
        this.isim=isim;
    }


    public Student(int tel){
      this.telno=tel;

    }

    public Student(String isimgir, int telnogir) {
        this.isim=isimgir;
        this.telno=telnogir;
    }

    // getter ve setter larımız
// method lardır
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTelno() {
        return telno;
    }

    public void setTelno(int telno) {
        this.telno = telno;
    }
    public  void KayitOlustur(){
        System.out.println();
    }

}

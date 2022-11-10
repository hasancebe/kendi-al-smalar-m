package kendi_calismalarim;

import java.util.Scanner;

public class C01_dogumgunukarsilastirma {
    public static void main(String[] args) {
        //kullanıcıdan iki doğum günü alıp
        //kimin önce doğduğunu consolda yazdıran program yazınız
        Scanner scan= new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("lütfen  adınızı ve doğum tarihinizi yıl, ay, gün olarak giriniz");
        String isim1=scan.nextLine();
        int yil1= scan.nextInt();
        int ay1= scan.nextInt();
        int gun1= scan.nextInt();
        System.out.println("lütfen adınızı ve  doğum  tarihinizi yıl, ay, gün olarak giriniz");
        String isim2=scan2.nextLine();
        int yil2= scan2.nextInt();
        int ay2= scan2.nextInt();
        int gun2= scan2.nextInt();

       if(yil1<yil2){
           System.out.println(isim1 + " önce doğmuştur");}
           else if(yil2<yil1){
           System.out.println(isim2 + " önce doğmuştur");}

       if(yil1 == yil2) {
           if (ay1 < ay2)
               System.out.println(isim1 + " önce doğmuştur");
           else if(ay2<ay1)
               System.out.println(isim2 + " önce doğmuştur");
       }
       if(yil1==yil2 && ay1==ay2 ) {
           if (gun1 < gun2){
               System.out.println(isim1 + " önce doğmuştur");}
           else if(gun2<gun1){
               System.out.println(isim2 + " önce doğmuştur");}
       }

    }
}

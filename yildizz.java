package kendi_calismalarim;

import java.util.Scanner;

public class yildizz {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayi = scan.nextInt()+2;
        String cizgili="- ";
        String cizgili1=" -";
        String yildiz = "* ";
        String yildiz1=" *";
        String bosluk=" ";
        if(sayi%2!=0)
            sayi=sayi-1;
        int boslukSayisi=1;
        int boslukkontrol=sayi;

        for (int i = 0; i <=sayi ; i++) {

            if(i==0)
                    System.out.print(bosluk.repeat(sayi-1)+"*");

            if(boslukkontrol-boslukSayisi>0){
                System.out.print(bosluk.repeat(boslukkontrol-boslukSayisi)+yildiz1.repeat(i));

                if(i>0)
                    System.out.print("|"+yildiz.repeat(i));

                boslukSayisi++;
                boslukkontrol--;
                System.out.println();}
        }

        System.out.println("*"+ cizgili.repeat(sayi/2-1)+"|"+cizgili1.repeat(sayi/2-1)+"*");

        int newsayi=sayi/2;
        int boslukSayisi1=newsayi;
        int boslukkontrol1=newsayi+1;

        for (int i = newsayi-1; i >0 ; i--) {

            int yazilacak_Boslusayisi=boslukkontrol1-boslukSayisi1;

            String bosluk1=" ";

            if(yazilacak_Boslusayisi==1)
                System.out.println(bosluk1.repeat(yazilacak_Boslusayisi)+yildiz1.repeat(i)+"|"+yildiz.repeat(i));
            else
                System.out.println(bosluk1.repeat(yazilacak_Boslusayisi)+yildiz1.repeat(i)+"|"+yildiz.repeat(i));
            if(i==1)
                System.out.println(bosluk1.repeat(newsayi*2-1)+"*");
            boslukSayisi1--;
            boslukkontrol1++;
        }
        System.out.println();
    }
}

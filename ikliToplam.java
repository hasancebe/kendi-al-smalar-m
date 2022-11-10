package kendi_calismalarim;

import java.util.ArrayList;
import java.util.List;

public class ikliToplam {
    public static void main(String[] args) {
        int [][] sayilar={{2, 1},{3, 9}, {9, 3}, {1, 6}};
        List<Integer> ayniToplam=new ArrayList<>();
       for (int i = 0; i <sayilar.length ; i++) {
            int a=sayilar[i][0]+sayilar[i][1];
            for (int j = 0; j <sayilar.length ; j++) {
                if(a==sayilar[j][0]+sayilar[j][1]){
                    ayniToplam.add(sayilar[j][0]);
                    ayniToplam.add(sayilar[j][1]);

                }
            }
        }
        System.out.println(ayniToplam);
    }
}

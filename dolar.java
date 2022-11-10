package kendi_calismalarim;

/*Question 7:Create 2D array.
Sample > {{"$5" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
If the array has $, multiple that value with 19,
If the array has €, multiple the value with 18 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dolar {
    public static void main(String[] args) {


        String[][] deger = {{"$5", "$22"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        List<Integer> numberlist=new ArrayList<>();
        String newValue="";
        String newvalue2="";
        Integer numberValue=0;
        int numberValue2=0;
        for (int i = 0; i <deger.length ; i++) {
            for (int j = 0; j < deger[i].length; j++) {

                if(deger[i][j].contains("$")){
                    newValue=deger[i][j].replace("$", "");

                    numberValue=Integer.parseInt(newValue);
                    numberValue=numberValue*19;
                    newValue=String.valueOf(numberValue);
                    deger[i][j]=newValue+"TL";

                   // numberlist.add(numberValue);
                }
                else if(deger[i][j].contains("€")){
                    newvalue2= deger[i][j].replace("€","");
                    numberValue2=Integer.parseInt(newvalue2);
                    numberValue2=numberValue2*18;
                    newvalue2=String.valueOf(numberValue2);
                    deger [i][j]=newvalue2+"TL";
                    //numberlist.add(numberValue2);
                }

            }

        }
        System.out.println(Arrays.deepToString(deger));
    }
}
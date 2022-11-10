package kendi_calismalarim;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Question 7:Create 2D array.
Sample > {{"$5" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
If the array has $, multiple that value with 19,
If the array has €, multiple the value with 18 */

public class C09_dolar {
    public static void main(String[] args) {
        String [][] deger={{"$5" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

          List < Integer> numberlist=new ArrayList<>();

        for (int i = 0; i < deger.length ; i++) {
            for (int j = 0; j <deger[i].length ; j++) {

                if(deger[i][j].contains("$")) {
                    String newvalue = deger[i][j].replace("$", "");
                    int numberValue = Integer.parseInt(newvalue);
                    numberValue = numberValue * 19;

                    numberlist.add(numberValue);
                }
                     else if(deger[i][j].contains("€")){
                        String newvalue2= deger[i][j].replace("€","");
                        int numberValue2=Integer.parseInt(newvalue2);
                        numberValue2=numberValue2*18;

                        numberlist.add(numberValue2);
                }
            }
        }
        System.out.println(numberlist);

            }
}

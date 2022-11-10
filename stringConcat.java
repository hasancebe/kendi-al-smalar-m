package kendi_calismalarim;

import java.util.Arrays;

public class stringConcat {
    public static void main(String[] args) {




        System.out.println("-----------------------------");

        int[] arr = {3, 4, 5};
        System.out.println(Arrays.toString(method(arr)));
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------");
        System.out.println(Arrays.toString(changeElement(arr)));
        System.out.println(Arrays.toString(arr));
        System.out.println("********************************");
String akl="hasan";
        System.out.println(mmethodtostring(akl));
        System.out.println(akl);
        System.out.println("???????????????????????????");
    }
        public static String mmethodtostring(String app){
          app="cebe";

            return app;
        }
    public  static int [] method(int [] array){

        int[] newarray=new int[array.length+2];
        for (int i = 0; i <newarray.length ; i++) {
            newarray[i]=5;
        }
array=newarray;
        return array;
    }
    public static int [] changeElement(int [] array){
        array[0]=80;
        array[1]=90;
        return array;



    }
}

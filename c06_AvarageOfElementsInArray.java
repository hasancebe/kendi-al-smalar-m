package kendi_calismalarim;

import java.util.ArrayList;
import java.util.List;

public class c06_AvarageOfElementsInArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10};

        int totalValue=0;
        int averageValue=0;
        List<Integer> greaterValue=new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            totalValue=totalValue+array[i];

        }
        averageValue=totalValue/array.length;
        System.out.println("average value of arrary members " +averageValue);
        for (int i = 0; i <array.length ; i++) {
            if(averageValue<array[i]){
                greaterValue.add(array[i]);


        }

        }
        System.out.println("gretar than average value members in array " +greaterValue);
    }
}

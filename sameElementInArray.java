package kendi_calismalarim;

import java.util.ArrayList;
import java.util.List;

public class sameElementInArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,5,4,6,7,8,9,10,1};
        int [] arr2={3,4,1,4,1};
        List<Integer>sameNumber=new ArrayList<>();
        List<Integer>yeniSameNumber=new ArrayList<>();
        if(arr1.length<arr2.length){
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if(arr1[i]==arr2[j]){
                    sameNumber.add(arr1[i]);
                }
            }
        }}else {
            for (int i = 0; i <arr2.length ; i++) {
                for (int j = 0; j <arr1.length ; j++) {
                    if (arr2[i] == arr1[j]) {
                        sameNumber.add(arr2[i]);
                        break;
                    }
                }


        }}
        for (int i = 0; i <sameNumber.size() ; i++) {
            for (int j = 1; j <sameNumber.size() ; j++) {
                if(!(sameNumber.get(i)==sameNumber.get(j))){
                    yeniSameNumber.add(sameNumber.get(i));
                    break;
                }

            }

        }

        System.out.println(sameNumber);
        System.out.println(yeniSameNumber);



}}

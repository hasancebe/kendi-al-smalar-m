package kendi_calismalarim;

import java.util.Arrays;

public class c05_squarsArray {
    public static void main(String[] args) {
        int[] array={2,4,6,8,5,9};

        for (int i = 0; i <array.length ; i++) {
            array[i]=array[i]*array[i];

        }
        System.out.println(Arrays.toString(array));
    }
}

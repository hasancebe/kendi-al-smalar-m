package kendi_calismalarim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_membersOfSumValue {
    public static void main(String[] args) {
        int[] number = {2, 4, 3, 3, 9, 8, 1, 5};
        int[][] memberCouple = new int[4][2];
        int[] sumarray = new int[memberCouple.length];
        List<Integer> sameTotalMember = new ArrayList<>();

        int i = 0;
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 1; k++) {
                memberCouple[j][k] = number[i];
                memberCouple[j][k + 1] = number[i + 1];
            }
            i = i + 2;
        }
        System.out.println(Arrays.deepToString(memberCouple));

        for (int a = 0; a < memberCouple.length; a++) {
            int toplam = 0;
            for (int j = 0; j < memberCouple[a].length; j++) {
                toplam += memberCouple[a][j];
            }
            sumarray[a] = toplam;
        }
        System.out.println(Arrays.toString(sumarray));



// OUTPUT:[[2, 4], [3, 3], [9, 8], [1, 5]]
//[6, 6, 17, 6]

        }
    }







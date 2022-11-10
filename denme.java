package kendi_calismalarim;

import java.util.Arrays;

public class denme {
    public static void main(String[] args) {

            String abc="hasaASDn 123 knahu 987 +& jkn.";
            char[] charToString=abc.toCharArray();
            System.out.println(Arrays.toString(charToString));
            int letter=0;
            int digit=0;
            int soace=0;
            int alpha=0;
            char a='A';
            boolean b=Character.isAlphabetic(a);

        System.out.println(b);
        for (int i = 0; i <charToString.length ; i++) {

              if (Character.isDigit(charToString[i])) {
                digit++;
            }
            else if(Character.isSpaceChar(charToString[i]))
                soace++;
            else if (Character.isAlphabetic(charToString[i])) {
                alpha++;
            }
        }
        System.out.println(letter+ " "+ digit+ " "+soace+ " "+alpha);
        }
    }


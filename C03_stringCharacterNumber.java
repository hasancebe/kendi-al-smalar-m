package kendi_calismalarim;

import java.util.Scanner;

public class C03_stringCharacterNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a sentence");
        String abc= scan.nextLine();
        System.out.println(characterNumber(abc));

    }
    public  static int characterNumber( String str){
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
                count ++;
            }
        }
        return  count;
    }
}

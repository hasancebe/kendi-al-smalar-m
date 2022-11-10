package kendi_calismalarim;

import java.util.Scanner;

public class charToIntValue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a char");
        String ch =scan.next();
        char charvalue=ch.charAt(0);
        int intCharValue=charvalue;
        System.out.println(intCharValue);

    }
}

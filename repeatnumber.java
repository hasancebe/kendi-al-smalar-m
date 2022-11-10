package kendi_calismalarim;

import java.util.Scanner;

public class repeatnumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scan.nextInt();

        System.out.println("" +number+ " " +(10*number+number)+ " "+(100*number+10*number+number));
    }
}

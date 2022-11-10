package kendi_calismalarim;

import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a number for convert hour information");
        int clock= scan.nextInt();
        int seconds=clock%60;
        int hour= clock/60;
        int minute=hour%60;
            hour=hour/60;
        System.out.println(hour +":"+ minute+":"+seconds);
    }
}

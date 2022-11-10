package kendi_calismalarim;

import java.util.Scanner;

public class C04_fibonacciNumber30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number, less than 30");
        String number = scan.nextLine();
        int flag=0;

        for (int i = 0; i <number.length() ; i++) {
        if (Character.isLetter(number.charAt(i))) {
            flag++;  }
        }
        if(flag!=0){
            System.out.println("please enter a number not a letter");
        }
        else {
            int numbervalue = Integer.valueOf(number);
            fibonacciNumber(numbervalue);
        }
    }
    public static void fibonacciNumber(int nmbr){

        int firstNumber=0;
        int secondNumber=1;
        int thirdNumber;

         if(nmbr>30){
            System.out.println("please enter a number not bigger than 30");

        }else if(nmbr<=30) {
            System.out.print("" + firstNumber + " " + secondNumber);
            for (int i = 0; i < nmbr - 2; i++) {
                thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                System.out.print(" " + thirdNumber);
            }
        }
    }
}

package kendi_calismalarim;

import java.util.Scanner;

public class calculation01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter first number");
        int firstNumber= scan.nextInt();
        System.out.println("please eneter second number");
        int secondNumber= scan.nextInt();
        System.out.println("please enter math process");
        String process= scan.next();
        switch (process){
            case "+":
                System.out.println(sum(firstNumber,secondNumber));
                break;
            case "-":
                System.out.println(subtract(firstNumber,secondNumber));
                break;
            case "*":
                System.out.println(multiply(firstNumber,secondNumber));
                break;
            case "/":
                divide(firstNumber,secondNumber);
                break;
        }
    }

    public  static int sum(int number1, int number2){
        int result= number1+number2;
        return result;
    }
    public  static int subtract(int number1, int number2){
        int result= number1-number2;
        return result;
    }
    public  static int multiply(int number1, int number2){
        int result= number1*number2;
        return result;
    }
    public  static void divide(int diviningnumber, int divisionnumber){
        double result;
        if(divisionnumber==0){
            System.out.println("undefined");
        } else if (diviningnumber==0) {
            System.out.println(result=0);

        }else{
            result=diviningnumber/divisionnumber;
            System.out.println(result);
        }

    }
}

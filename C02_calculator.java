package kendi_calismalarim;

import java.util.Scanner;

public class C02_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the  first number");
        int firstNumber = scan.nextInt();
        System.out.println("please enter second number");
        int secondNumber = scan.nextInt();
        System.out.println("please enter math process");
        String process = scan.next();

        switch (process) {
            case "+":
                System.out.println(sum(firstNumber, secondNumber));
            break;
            case "-":
                System.out.println(subtract(firstNumber, secondNumber));
            break;
            case "*":
                System.out.println(multiplication(firstNumber, secondNumber));
            break;
            case "/":
                division(firstNumber, secondNumber);
            break;
        }
    }

    public static int sum(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static int subtract(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }

    public static int multiplication(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    public static void division(int diviningNumber, int divisionNumber) {
        double result;
        if (divisionNumber == 0) {
            System.out.println("undefined");
        }
        else if (diviningNumber == 0) {
           System.out.println(result = 0);
        }
        else  {
            result = diviningNumber / divisionNumber;
            System.out.println(result);

        }
    }
}
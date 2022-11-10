package kendi_calismalarim;

import java.util.Scanner;

public class betwwenNumberModule {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        Scanner scan3=new Scanner(System.in);
        System.out.println("please enter number1");
        int firstNumber=scan.nextInt();
        System.out.println("please enter number2");
        int secondNumber= scan2.nextInt();
        System.out.println("please enter number3");
        int diviningNumber= scan3.nextInt();
            int count=0;
        while(firstNumber<secondNumber-1){

            if((firstNumber+1)%diviningNumber==0){
                System.out.print(firstNumber+1 + ", ");

                count++;

            }
            firstNumber++;
        }
        System.out.println();
        System.out.println(count +" adet sayı var" );
    }
}

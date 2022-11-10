package kendi_calismalarim;
//kullanıcıdan bir cümle ve harf alın.
// girilen harf cümlede kaç defa geçiyorsa adedini yazdırın

import java.util.Scanner;

public class repeatletter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter sentence");
        String sentence= scan.nextLine();
        System.out.println("please enter a char");
        String enteredChar=scan.next();
        char letter=enteredChar.charAt(0);
        String[] letterayrac=sentence.split(enteredChar);
        int count2=letterayrac.length-1;

       int count=0;
        for (int i = 0; i <sentence.length() ; i++) {
            if(sentence.charAt(i)==letter){
                count++;

            }

        }
        if(count!=0) {
            System.out.println("entered char " + count + " time used");
            System.out.println(count2);
        }else{
            System.out.println("entered char is not used");
        }
    }
}

package kendi_calismalarim;

import java.util.Scanner;

public class stringQuestion_Question3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a string more than 3 letters");
        String word= scan.next();
        if(word.length()==1){
            System.out.println(word.repeat(3));}
        else if(word.length()==2){
            System.out.println(word.repeat(2));}
        else if (word.length()%2!=0 && word.length()>=3){
            System.out.println(word.charAt(word.length()/2));}
        else if (word.length()%2==0 && word.length()>2){
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));}
    }
}

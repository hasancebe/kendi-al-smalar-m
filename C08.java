package kendi_calismalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08 {
    // create method to take all grades(numbers) from the teacher higher than 100
    // and save them in a list and return it
    public static void main(String[] args) {
        System.out.println(takeAllGrade());
    }
    public static List<Integer>takeAllGrade(){
        Scanner scan= new Scanner(System.in);
        Integer grade=0;
        List<Integer> gradeList=new ArrayList<>();

         while(grade<=100){
             System.out.println(" please enter the grade of student");
             grade= scan.nextInt();

             if(grade<=100){
                 gradeList.add(grade);
             }
         }

        return gradeList;
    }
}

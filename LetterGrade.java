package chapterFive;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        int total =0;
        int gradeCounter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade in the range 0-100:");
        while (input.hasNext()){
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;
             switch (grade / 10){
                 case 9:
                 case 10:
                     System.out.println("A");
                     break;
                 case 8:
                     System.out.println("B");
                     break;
                 case 7:
                     System.out.println("C");
                     break;
                 case 6:
                     System.out.println("D");
                     break;
                 default:
                     System.out.println("F");
                     break;
             }
        }
        if(gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grade entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n",average);
        }
    }
}

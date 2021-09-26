package chapterFive;

import java.util.Scanner;

public class FiveBarChartPrinting {
    public static void main(String[] args) {


    Scanner collect = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number1 = collect.nextInt();
    int number2 = collect.nextInt();
    int number3 = collect.nextInt();
    int number4 = collect.nextInt();
    int number5 = collect.nextInt();

     if( number1 <= 30){
         for(int count = 1; count <= 30; count++){
             System.out.println("*");
             System.out.println("");
         }
     }
     else {
         System.out.println("Enter a valid number");
     }
     if(number2 <= 30){
         for(int counter = 1; counter <= 30; counter++){
             System.out.print("*");
             System.out.println("");
         }
     }
     else {
         System.out.println("Enter a valid number");
     }




    }
}

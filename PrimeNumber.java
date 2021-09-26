package chapterFive;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        int numb = 1;
        System.out.println("Enter a number:");
        int naturalNumber = collect.nextByte();
        while(numb <= 10){
            int prime = naturalNumber / 2;
            numb++;
            System.out.printf("This is a prime number %d%n", prime);
                if(numb < 0){
                }
                else
                    System.out.println("This is not a prime number");
        }

    }
}

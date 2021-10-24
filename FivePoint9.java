package chapterFive;

import java.util.Scanner;

public class FivePoint9 {
    public static void main(String[] args) {
        for(int i = 100; i >= 1; i--)
                System.out.print(i);
        System.out.println();

        /**
         * The following code should print whether integer value is odd or even
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        int value = input.nextInt();
        switch (value % 2){
            case 0:
                System.out.println("Even integer");
                break;
            case 1:
                System.out.println("Odd integer");
                break;
        }

        /**
         * The following code should output the odd integers from 19 to 1
         */
        for(int i = 19; i >= 1; --i)
            System.out.print(i);
        System.out.println();

        /**
         * The following code should output the even integers from 2 to 100
         */
        int counter = 2;
        do {
            System.out.println(counter);
            counter += 2;
        }while (counter < 100);
    }

}

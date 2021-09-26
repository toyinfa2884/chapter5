package chapterFive;

import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner collectBinary = new Scanner(System.in);
        int binary;
        System.out.println("Enter a binary number (e.g 101011):");
        binary = collectBinary.nextInt();
        int decimal = 0;
        int power = 0;
        while(binary != 0){
            decimal += ((binary % 10) * Math.pow(2, power));
            binary = binary / 10;
            power++;
        }
        System.out.println("Decimal equivalent is:" + decimal );

    }
}

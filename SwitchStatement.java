package chapterFive;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //System.out.println("\n".repeat(50));//recursive loop-chapter 7
        String prompt = """
                1. Create Account
                2. Close Account
                3. Borrow Nirsal Loan
                4. Japa with Nirsal Loan
                Press any key
                """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userResponse = input.nextInt();
        switch (userResponse){
            case 1: System.out.println("5million approved");break;

            case 2: System.out.println("Account created");break;

            case 3: System.out.println("Account closed");break;

            case 4: System.out.println("Japa"); default:
        }
        if(userResponse == 1) System.out.println("Account created");
            if(userResponse == 2) System.out.println("Account closed");
                if(userResponse == 3) System.out.println("5million approved");
                    if(userResponse == 4) System.out.println("Japa");



    }
}

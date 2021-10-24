package chapterFive;

public class FivePoint4 {
    public static void main(String[] args) {
        /**
         * Question 1.
         */

        int i = 1;
        while (i <= 10) {
            System.out.print(i);
            ++i;
        }
        System.out.println();

        /**
         * Question 2.
         */


        for(int k = 1; k != 10; k += 1)
            System.out.println((double) k / 10);

        /**
         * Question 3.
          */


        int n = 0;
        switch (n){
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            default:
                System.out.println("The number is not 1 or 2");
        }
       /**
        * Question 4.
        */
        n = 1;
        while (n <= 10)
            System.out.print(n++);
    }
}

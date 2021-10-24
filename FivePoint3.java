package chapterFive;

public class FivePoint3 {
    public static void main(String[] args) {
        /**
         *  Sum the odd integers between 1 and 99, using a for statement. Assume that the integer
         * variables sum and count have been declared.
         */
        int sum = 0;
        int count = 1;
        for (; count <= 99; count += 2){
            sum += count;
        }
        System.out.printf("The sum is %d%n", sum);

        /**
         *  Calculate the value of 2.5 raised to the power of 3, using the pow method.
         */
        double value = Math.pow(2.5,3);
        System.out.println(value);

        /**
         * Print the integers from 1 to 20, using a while loop and the counter variable i. Assume
         * that the variable i has been declared, but not initialized. Print only five integers per line.
         * [Hint: Use the calculation i % 5. When the value of this expression is 0, print a newline
         * character; otherwise, print a tab character. Assume that this code is an application. Use
         * the System.out.println() method to output the newline character, and use the System.out.print('\t')
         * method to output the tab character.
         */
        int i = 1;
        while (i <= 20){
            System.out.print(i);
            if(i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
            ++i;
        }


        /**
         *  Repeat part (c), using a for statement.
         */
        for(; i <= 20; i++){
            System.out.print(i);
            if(i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
        }
    }
}

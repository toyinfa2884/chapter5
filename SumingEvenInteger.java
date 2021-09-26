package chapterFive;

public class SumingEvenInteger {
    public static void main(String[] args) {
        int total = 0;
        for(int count = 2; count <= 20; count+= 2) {
            total += count;
            System.out.printf("Sum is %d%n", total);
        }
    }
}

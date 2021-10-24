package chapterFive;

public class ForCounterControlLoop {
    public static void main(String[] args) {
        int counter = 10;
        for(; counter >= 1; counter--)
            System.out.printf("%d", counter);
            System.out.println();
        for(int i = 1; i <= 10; i *= 3)
            System.out.println( i );
    }
}

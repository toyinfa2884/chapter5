package chapterFive;

public class BreakStatement {
    public static void main(String[] args) {
        int count;
        for(count = 1; count <=10; count++){
            if(count== 8)
                break;
            System.out.printf("%d", count);
        }
        System.out.printf("%n Broke out of loop at count = %d%n", count);
    }
}

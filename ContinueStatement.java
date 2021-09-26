package chapterFive;

public class ContinueStatement {
    public static void main(String[] args) {
        int count;
        for(count = 1; count <= 10; count++){
            if(count == 7)
                continue;
            System.out.printf("%d", count);
        }
        System.out.printf("%nUsed continue to skip printing 7%n");
    }
}

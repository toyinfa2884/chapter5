package chapterFive;

public class TriangleD {
    public static void main(String[] args) {
        int num;
        int numb;
        int number;
        for(num = 10; num > 0; num--){
            for(numb = 0; numb < num -1; numb++)
                System.out.print("");
                for(number = 10; number > num -1; number++)
                   System.out.print("*");
                System.out.println();


        }
    }
}

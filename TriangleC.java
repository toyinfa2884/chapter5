package chapterFive;

public class TriangleC {
    public static void main(String[] args) {

        int code;
        int coder;
        int coded;
        for (code = 0; code < 10; code++) {
            for(coder = 1; coder < code+1; coder++)
                System.out.print(" ");
                for(coded = 10; coded > code; coded-- )
            System.out.print("*");

        }
    }
}

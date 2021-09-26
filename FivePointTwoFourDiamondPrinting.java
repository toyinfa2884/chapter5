package chapterFive;

public class FivePointTwoFourDiamondPrinting {
    public static void main(String[] args) {


        int code;
        int coder;
        int coded;
        for (code = 1; code <= 8; code++) {
            for (coder = 0; coder < code+1; coder--)
                System.out.print("*");
        }
    }
}
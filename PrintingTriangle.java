package chapterFive;

public class PrintingTriangle {
    public static void main(String[] args) {
        int count;
        int counter;
        for(count = 0; count <= 10; count+= 1){
                for(counter = 0; counter < count ; counter++)
                        System.out.print("*");
                        System.out.println();
       }

    }
}

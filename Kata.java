package chapterFive;

public class Kata {
    int price;
    int copy = 0;
    public int calPriceOfCopies1(int price) {
        if(copy >= 1 && copy <= 4) {
            price = price * 1500;
        }
        if(copy >= 1 && copy <= 4){
            price = price * 3000;
        }
        if(copy >= 1 && copy <= 4){
            price = price * 4500;
        }
        if(copy >=1 && copy <= 4){
            price = price * 6000;
        }
        return price;
    }


    public int calPriceOfCopies2(int price) {
        if( copy >=5 && copy <= 9 ) {
            price = price * 1400;
        }
        if(copy >= 5 && copy <= 9) {
            price = price * 2800;
        }
        if(copy >= 5 && copy <= 9) {
            price = price * 4200;
        }
        if(copy >= 5 && copy <= 9){
            price = price * 5600;
        }
        if(copy >= 5 && copy <= 9){
            price = price * 7000;
        }
        return price;
    }



}

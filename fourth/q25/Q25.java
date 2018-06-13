package fourth.q25;

import java.util.Arrays;
import java.util.stream.*;
public class Q25 {

    public static void main(String[] aaa){
        Double total = Arrays.asList(
                new Book(25.20),
                new Book(22.98),
                new Book(16.77)
        ).stream().collect(Collectors.summingDouble(book -> book.getPrice()));
        System.out.println(total);
    }
    static class Book{
        private Double price;
        public Book(){

        }
        public Book(double p){
            this.price = p;
        }
        public double getPrice(){
            return this.price;
        }
    }
}

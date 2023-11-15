package ten.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Book implements Comparable<Book>{
    int price;

    public Book(int price){
        this.price=price;
    }

    @Override
    public int compareTo(Book o) {
        return this.price-o.price;
    }

    public static void main(String[] args) {
        Book[] books = new Book[]{new Book(1000), new Book(5000), new Book(3000)};

        // Comparable 인터페이스를 활용하여 정렬
        Arrays.sort(books);

        // 정렬된 결과 출력
        for (Book book : books) {
            System.out.println(book.price);
        }
    }
}
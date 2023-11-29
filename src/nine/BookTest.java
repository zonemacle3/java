package nine;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("비매품");
        Book b3 = new Book(3000,"수학책");

        b1.showPrint();
        b2.showPrint();
        b3.showPrint();

    }
}

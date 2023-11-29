

package nine;

public class Book {
    int price;
    String title;

    public Book() {
        this(0,"비입력");
    }

    public Book(String title){
        this(0,title);
    }
    public Book(int price, String title){
        this.price = price;
        this.title = title;
    }

    public void showPrint(){
        System.out.println(title + "의 가격은 " + price + "입니다.");
    }
}

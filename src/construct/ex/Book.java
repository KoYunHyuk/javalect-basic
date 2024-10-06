package construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // Construct
    Book(){
        this("", "");
    }
    Book(String title, String author){
        this(title, author, 0);
    }
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // Method
    void DisplayInfo(){
        System.out.println("title : " + title + ", author : " + author + ", page = " + page);
    }
}

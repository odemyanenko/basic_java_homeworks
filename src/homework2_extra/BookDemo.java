package homework2_extra;

public class BookDemo {
  public static void main(String[] args) {
    Book myBook = new Book("Principles");
    String bookTitle = myBook.getTitle();
    System.out.println("Book title = " + bookTitle);
  }
}

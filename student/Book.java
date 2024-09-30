package student;
import java.util.*;

class Books {
    static String bookName;
    static String isbnNumber;
    static String authorName;
    static String publisher;

    void book(String name, String isbn, String author, String pub) {
        bookName = name;
        isbnNumber = isbn;
        authorName = author;
        publisher = pub;
    }

    public void setBookName(String name) {
        bookName = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setIsbnNumber(String isbn) {
        isbnNumber = isbn;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setAuthorName(String author) {
        authorName = author;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setPublisher(String pub) {
        publisher = pub;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookInfo() {
        return "Book Name: " + bookName + 
               "\nISBN Number: " + isbnNumber + 
               "\nAuthor Name: " + authorName + 
               "\nPublisher: " + publisher;
    }
}    
public class Book {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter the ISBN number: ");
        String isbnNumber = scanner.nextLine();

        System.out.print("Enter the author name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter the publisher: ");
        String publisher = scanner.nextLine();
        Books myBook = new Books();
        myBook.book(bookName,isbnNumber,authorName,publisher);
        System.out.println(myBook.getBookInfo());
    }
}


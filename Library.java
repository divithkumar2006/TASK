package library;

public class Library {

import java.util.ArrayList;
import java.util.List;


    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByid(String id) {
        for (Book book : books) {
            if (book.getid().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public boolean issueBook(String id) {
        Book book = findBookByid(id);
        if (book != null) {
            return book.issue();
        }
        return false;
    }

    public boolean returnBook(String id) {
        Book book = findBookByid(id);
        if (book != null) {
            return book.returnBook();
        }
        return false;
    }

    public boolean isAvailable(String id) {
        Book book = findBookByid(id);
        return book != null && book.isAvailable();
    }




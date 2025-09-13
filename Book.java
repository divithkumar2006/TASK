package library;

public class Book {
    private String Title;
    private String author;
    private String id;
    private boolean issued;

    public Book(String title, String author, String id) {
        this.Title = title;
        this.author = author;
        this.id= id;
        this.issued = false;
    }

    public String getTitle() { return Title; }
    public String getAuthor() { return author; }
    public String getid() { return id; }

    @Override
    public boolean issue() {
        if (!issued) {
            issued = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook() {
        if (issued) {
            issued = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isAvailable() {
        return !issued;
    }
}



package Model;

public class Book {
    private String bookID;
    private String bookName;
    private String authorName;
    private int publishedYear;
    private double price;
    private String genre;
    private boolean isActive;
    
    
    public Book() {
    }

    
    public Book(String bookID, String bookName, String authorName, int publishedYear, double price, String genre, boolean isActive) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.price = price;
        this.genre = genre;
        this.isActive = isActive;
    }

    
    public String getBookID() { return bookID; }
    public void setBookID(String bookID) { this.bookID = bookID; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public int getPublishedYear() { return publishedYear; }
    public void setPublishedYear(int publishedYear) { this.publishedYear = publishedYear; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public boolean isActive() { return isActive; }
    public void setIsActive(boolean isActive) { this.isActive = isActive; }
}

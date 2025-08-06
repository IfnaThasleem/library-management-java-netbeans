package DAO;

import Model.Book; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    
public class BookDAO {

    
    private final String DB_URL = "jdbc:mysql://localhost:3306/LibraryDB"; 
    private final String DB_USER = "root"; 
    private final String DB_PASSWORD = "1234"; 
    private Connection connection;

    public BookDAO() {
        connectDatabase();
    }

    private void connectDatabase() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Database connected successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBook(String bookID, String bookName, String author, int publishedYear, double price, String genre) {
        String query = "INSERT INTO books (bookID, bookName, authorName, publishedYear, price, genre) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, bookID);
            pst.setString(2, bookName);
            pst.setString(3, author);
            pst.setInt(4, publishedYear);
            pst.setDouble(5, price);
            pst.setString(6, genre);
            int rowsAffected = pst.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            if (rowsAffected > 0) {
                System.out.println("Book added successfully.");
            } else {
                System.out.println("No rows added.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(String bookID, String bookName, String author, int publishedYear, double price, String genre) {
        String query = "UPDATE books SET bookName = ?, authorName = ?, publishedYear = ?, price = ?, genre = ? WHERE bookID = ?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, bookName);
            pst.setString(2, author);
            pst.setInt(3, publishedYear);
            pst.setDouble(4, price);
            pst.setString(5, genre);
            pst.setString(6, bookID);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("No rows updated. Check if the bookID exists.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 public void markBookAsInactive(String bookID) {
    String query = "UPDATE books SET isActive = ? WHERE bookID = ?";
    
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setBoolean(1, false);  
        stmt.setString(2, bookID);   

        int rowsAffected = stmt.executeUpdate(); 
        System.out.println("Rows affected by inactive update: " + rowsAffected);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    public List<Book> getAllBooks() {
    List<Book> books = new ArrayList<>();
    String query = "SELECT bookID, bookName, authorName, publishedYear, price, genre, isActive FROM books";
    
    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {
        
        while (resultSet.next()) {
            String bookID = resultSet.getString("bookID");
            String bookName = resultSet.getString("bookName");
            String authorName = resultSet.getString("authorName");
            int publishedYear = resultSet.getInt("publishedYear");
            double price = resultSet.getDouble("price");
            String genre = resultSet.getString("genre");
            boolean isActive = resultSet.getBoolean("isActive");  

            
            Book book = new Book(bookID, bookName, authorName, publishedYear, price, genre, isActive);
            books.add(book);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return books;
}

    public List<String[]> searchBooks(String searchTerm) {
        List<String[]> books = new ArrayList<>();
        String query = "SELECT * FROM books WHERE bookName LIKE ? OR authorName LIKE ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "%" + searchTerm + "%");
            pstmt.setString(2, "%" + searchTerm + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String[] bookData = {
                    rs.getString("bookID"),
                    rs.getString("bookName"),
                    rs.getString("authorName"),
                    rs.getString("publishedYear"),
                    rs.getString("price"),
                    rs.getString("genre")
                };
                books.add(bookData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

  public List<Book> loadActiveBooks() {
    List<Book> activeBooks = new ArrayList<>();
    String query = "SELECT * FROM books WHERE isActive = true"; 
    
    try (Statement stmt = connection.createStatement(); 
         ResultSet rs = stmt.executeQuery(query)) {
        
        while (rs.next()) {
            
            Book book = new Book();
            book.setBookID(rs.getString("bookID"));
            book.setBookName(rs.getString("bookName"));
            book.setAuthorName(rs.getString("authorName"));
            book.setPublishedYear(rs.getInt("publishedYear"));
            book.setPrice(rs.getDouble("price"));
            book.setGenre(rs.getString("genre"));
            book.setIsActive(rs.getBoolean("isActive")); 

            activeBooks.add(book);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return activeBooks;
}

    boolean isBookAvailable(String bookID) {
       
    String query = "SELECT * FROM books WHERE bookID = ? AND bookID NOT IN (SELECT bookID FROM issue WHERE returnBook = 'No')";
    
    try (PreparedStatement pst = connection.prepareStatement(query)) {
        pst.setString(1, bookID);  
        ResultSet rs = pst.executeQuery();  
        
        return rs.next();  
    } catch (SQLException e) {
        e.printStackTrace();  
    }
    
    return false;  
}

          
   public String getBookName(String bookID) {
    String query = "SELECT bookName FROM books WHERE bookID = ?";  
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setString(1, bookID);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getString("bookName");  
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return "Unknown Book";  
}



}



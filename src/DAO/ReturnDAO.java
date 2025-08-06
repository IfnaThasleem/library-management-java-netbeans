package DAO;

import Model.ReturnBook;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReturnDAO {

    private Connection connection;

    
    public ReturnDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/LibraryDB"; 
            String user = "root";  
            String password = "1234";  

           
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to database successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public boolean returnBook(String bookID, int memberID, Date returnDate) {
       
        String sql = "UPDATE book_return SET status = 'Returned', returnDate = ? WHERE bookID = ? AND memberID = ? AND status = 'Issued'";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setDate(1, returnDate); 
            pst.setString(2, bookID);   
            pst.setInt(3, memberID);    

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;  
    }

    
    public boolean isBookReturned(String bookID, int memberID) {
        
        String query = "SELECT * FROM book_return WHERE bookID = ? AND memberID = ? AND status = 'Returned'";

        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, bookID); 
            pst.setInt(2, memberID);   

            ResultSet rs = pst.executeQuery();
            return rs.next();  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;  
    }

   
    public List<ReturnBook> getReturnedBooksByMember(int memberID) {
        List<ReturnBook> returnBooks = new ArrayList<>();
        
        String query = "SELECT * FROM book_return WHERE memberID = ? AND status = 'Returned'";

        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setInt(1, memberID);  
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String bookID = rs.getString("bookID");
                Date returnDate = rs.getDate("returnDate");

                
                ReturnBook returnBook = new ReturnBook(bookID, memberID, returnDate);
                returnBooks.add(returnBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return returnBooks;
    }

    
    public List<ReturnBook> getAllReturnedBooks() {
        List<ReturnBook> returnedBooks = new ArrayList<>();
        
        String query = "SELECT * FROM book_return WHERE status = 'Returned'";

        try (Statement stmt = connection.createStatement(); 
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String bookID = rs.getString("bookID");
                int memberID = rs.getInt("memberID");
                Date returnDate = rs.getDate("returnDate");

                
                ReturnBook returnBook = new ReturnBook(bookID, memberID, returnDate);
                
                returnedBooks.add(returnBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return returnedBooks;
    }



    public void closeConnection() {
    try {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
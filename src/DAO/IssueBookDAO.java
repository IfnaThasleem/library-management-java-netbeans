package DAO;

import Model.IssueBook;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DAO.MemberDAO;



public class IssueBookDAO {
    private Connection connection;
    private BookDAO bookDAO;  
    private MemberDAO memberDAO;  

   
    public IssueBookDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/LibraryDB";  
            String user = "root"; 
            String password = "1234";  

            
            connection = DriverManager.getConnection(url, user, password);
            bookDAO = new BookDAO();  
            memberDAO = new MemberDAO();  
            System.out.println("Connection to database successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public boolean issueBook(String bookID, int memberID, Date issueDate, Date dueDate) {
       MemberDAO memberDAO = new MemberDAO();
    boolean isActive = memberDAO.isMemberActive(memberID);

    
    if (!isActive) {
        
        return false;
    }

        
        if (!bookDAO.isBookAvailable(bookID)) {
            System.out.println("The book is already issued or unavailable.");
            return false;  
        }

        
    String query = "INSERT INTO issue (bookID, memberID, issueDate, dueDate, returnBook) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement pst = connection.prepareStatement(query)) {
       
        pst.setString(1, bookID);  
        pst.setInt(2, memberID);   
        pst.setDate(3, new java.sql.Date(issueDate.getTime()));  
        pst.setDate(4, new java.sql.Date(dueDate.getTime()));    
        pst.setString(5, "No");  

       
        int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }

    
    public boolean returnBook(String bookID, int memberID) {
        String sql = "UPDATE issue SET returnBook = 'Yes' WHERE bookID = ? AND memberID = ? AND returnBook = 'No'";
        
        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, bookID); 
            pst.setInt(2, memberID);  

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;  
    }

    
    public boolean isBookIssued(String bookID) {
        String query = "SELECT * FROM issue WHERE bookID = ? AND returnBook = 'No'";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, bookID);  
            ResultSet rs = pst.executeQuery();
            return rs.next(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;  
    }

    
    public List<IssueBook> getBooksIssuedByMember(int memberID, Date returnDate) {
        List<IssueBook> issueBooks = new ArrayList<>();
        String query = "SELECT * FROM issue WHERE memberID = ? AND returnBook = 'No'";

        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setInt(1, memberID);  
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String bookID = rs.getString("bookID");
                Date issueDate = rs.getDate("issueDate");
                Date dueDate = rs.getDate("dueDate");

                
                IssueBook issueBook = new IssueBook(bookID, memberID, issueDate, dueDate, returnDate);

                issueBooks.add(issueBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return issueBooks;
    }

    
   public List<IssueBook> getAllReturnedBooks() {
        List<IssueBook> returnedBooks = new ArrayList<>();
        String query = "SELECT * FROM issue WHERE returnBook = 'Yes'";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String bookID = rs.getString("bookID");
                int memberID = rs.getInt("memberID");
                Date issueDate = rs.getDate("issueDate");
                Date dueDate = rs.getDate("dueDate");
                Date returnDate = rs.getDate("returnDate");

                IssueBook issueBook = new IssueBook(bookID, memberID, issueDate, dueDate, returnDate);
                returnedBooks.add(issueBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return returnedBooks;
    }

  public List<IssueBook> getAllIssuedBooks() {
    List<IssueBook> issuedBooks = new ArrayList<>();
    
     
    String query = "SELECT * FROM issue WHERE returnBook = 'No'";  
    
    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            int memberID = rs.getInt("memberID");
            String bookID = rs.getString("bookID");
            Date issueDate = rs.getDate("issueDate");
            Date dueDate = rs.getDate("dueDate");
            
            
            IssueBook issueBook = new IssueBook(bookID, memberID, issueDate, dueDate, null);  
            
            
            issuedBooks.add(issueBook);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return issuedBooks;  
}

}


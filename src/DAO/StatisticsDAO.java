package DAO;

import Model.ReturnBook;
import Model.IssueBook;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatisticsDAO {

   private Connection connection;

   public StatisticsDAO() {
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

   public List<IssueBook> getAllIssuedBooks() {
      List<IssueBook> issuedBooks = new ArrayList<>();
      String query = "SELECT * FROM issue WHERE returnBook = 'No'";  

      try (PreparedStatement pst = connection.prepareStatement(query)) {
         ResultSet rs = pst.executeQuery();

         while (rs.next()) {
            String bookID = rs.getString("bookID");
            int memberID = rs.getInt("memberID");
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

   public List<ReturnBook> getAllReturnedBooks() {
      List<ReturnBook> returnedBooks = new ArrayList<>();
      String query = "SELECT bookID, memberID, returnDate FROM book_return WHERE returnStatus = 'Yes'";

      try (PreparedStatement pst = connection.prepareStatement(query);
           ResultSet rs = pst.executeQuery()) {

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

   public String getMemberName(int memberID) {
      String memberName = "";
      String query = "SELECT name FROM members WHERE memberID = ?";

      try (PreparedStatement pst = connection.prepareStatement(query)) {
         pst.setInt(1, memberID);
         ResultSet rs = pst.executeQuery();
         if (rs.next()) {
            memberName = rs.getString("name");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return memberName;
   }

   public String getBookName(String bookID) {
      String bookName = "";
      String query = "SELECT title FROM books WHERE bookID = ?";

      try (PreparedStatement pst = connection.prepareStatement(query)) {
         pst.setString(1, bookID);
         ResultSet rs = pst.executeQuery();
         if (rs.next()) {
            bookName = rs.getString("title");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return bookName;
   }

   public void closeConnection() {
      try {
         if (connection != null) {
            connection.close();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}

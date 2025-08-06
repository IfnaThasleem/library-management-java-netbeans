package Model;

import java.sql.Date;

public class ReturnBook {
    
 private String bookID;
    private int memberID;
    private Date returnDate;
    private String returnStatus;

   
    public ReturnBook(String bookID, int memberID, Date returnDate) {
        this.bookID = bookID;
        this.memberID = memberID;
        this.returnDate = returnDate;
        this.returnStatus = "Yes";  
    }

    
    public ReturnBook() {}

    
    public String getBookID() {
        return bookID;
    }

    
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    
    public int getMemberID() {
        return memberID;
    }

    
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

   
    public Date getReturnDate() {
        return returnDate;
    }

    
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
   public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    
    public void displayReturnBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Member ID: " + memberID);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Is Returned: " + returnStatus);
    }

    
    public static void main(String[] args) {
        
        Date returnDate = Date.valueOf("2024-11-23");
        
       
        ReturnBook returnBookObj = new ReturnBook("B12345", 101, returnDate);
        
        
        returnBookObj.displayReturnBookDetails();
    }
}

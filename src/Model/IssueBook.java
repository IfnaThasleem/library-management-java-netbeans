package Model;

import java.sql.Date;

public class IssueBook {
    private String bookID;        
    private int memberID;          
    private Date issueDate;      
    private Date dueDate;         
    private String returnBook;    

    
    public IssueBook(String bookID, int memberID, Date issueDate, Date dueDate, Date returnDate) {
        this.bookID = bookID;
        this.memberID = memberID;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnBook = "No";  
    }

    
    public IssueBook() {}

   
    

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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getReturnBook() {
        return returnBook;
    }

    public void setReturnBook( String returnBook) {
        this.returnBook = returnBook;
    }

    @Override
    public String toString() {
        return "IssueBook{" +
                "bookID='" + bookID + '\'' +
                ", memberID=" + memberID + 
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", returnBook='" + returnBook + '\'' +
                '}';
    }

    
}
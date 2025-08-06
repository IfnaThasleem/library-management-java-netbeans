package DAO;

import Model.Member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MemberDAO {

    
    private Connection connection;

    
    public MemberDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/LibraryDB";  
            String user = "root"; 
            String password = "1234";  
            this.connection = DriverManager.getConnection(url, user, password);  
            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean doesMemberExist(int memberID) {
        String query = "SELECT 1 FROM members WHERE member_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, memberID);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    
    public boolean doesCardNumberExist(String cardNumber) {
        String query = "SELECT 1 FROM members WHERE card_number = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cardNumber);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

public void addMember(Member member) {
    
    String query = "INSERT INTO members (member_name,email, contact_number, card_number, expiration_date,is_active) VALUES (?, ?, ?, ?, ?,?);";

    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        
        stmt.setString(1, member.getName());
        stmt.setString(3, member.getEmail());
        stmt.setString(2, member.getContactInfo());
        stmt.setString(4, member.getCardNumber());
        stmt.setDate(5, member.getExpirationDate()); 
        stmt.setInt(6, 1); 

       
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

   public void displayMembers() {
    String query = "SELECT member_id, member_name,email, contact_number,card_number, expiration_date, is_active FROM members";
try (Statement stmt = connection.createStatement();
     ResultSet rs = stmt.executeQuery(query)) {

    while (rs.next()) {
        int memberId = rs.getInt("member_id");
        String name = rs.getString("member_name");
         String email = rs.getString("email");
         String contactInfo = rs.getString("contact_number");
        int cardNumber = rs.getInt("card_number");
        Date expirationDate = rs.getDate("expiration_date");
        int isActive = rs.getInt("is_active");

        System.out.println(memberId + "\t" + name + "\t" + contactInfo + "\t" + email + "\t" + cardNumber + "\t" + expirationDate + "\t" + isActive);
    }
} catch (SQLException e) {
    System.out.println("Error fetching data: " + e.getMessage());
}
   }


    
    public List<Member> getAllMembers() {
        List<Member> memberList = new ArrayList<>();
        String query = "SELECT * FROM members";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Member member = new Member(
                    rs.getInt("member_id"),
                    rs.getString("member_name"),
                    rs.getString("email"),
                    rs.getString("contact_number"),
                   rs.getString("card_number"),
                    rs.getString("expiration_date")
                );
                member.setActive(rs.getBoolean("is_active"));
                memberList.add(member);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memberList;
    }

    
    public void updateMember(Member member) {
        String query = "UPDATE members SET member_name = ?, contact_number = ?, email = ?, card_number = ?, expiration_date = ?, is_active = ? WHERE member_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, member.getName());
            ps.setString(2, member.getContactInfo());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getCardNumber());
            ps.setDate(5, member.getExpirationDate());
            ps.setBoolean(6, member.isActive());
            ps.setInt(7, member.getMemberID());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void deactivateMember(int memberId) {
        String query = "UPDATE members SET is_active = ? WHERE member_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setBoolean(1, false);  
            pstmt.setInt(2, memberId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  
    public Member getMemberById(int memberId) {
        String query = "SELECT * FROM members WHERE member_id = ?";
        Member member = null;
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, memberId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    member = new Member(
                        rs.getInt("member_id"),
                        rs.getString("member_name"),
                        rs.getString("contact_number"),
                        rs.getString("email"),
                        rs.getString("card_number"),
                        rs.getString("expiration_date")
                    );
                    member.setActive(rs.getBoolean("is_active"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }

    
    public List<Member> searchMembers(String searchTerm) {
        List<Member> members = new ArrayList<>();
        String query = "SELECT * FROM members WHERE member_name LIKE ? OR email LIKE ? OR card_number LIKE ? OR contact_number LIKE ?";
        searchTerm = "%" + searchTerm.trim() + "%"; 
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, searchTerm);
            pstmt.setString(2, searchTerm);
            pstmt.setString(3, searchTerm);
            pstmt.setString(4, searchTerm);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Member member = new Member(
                        rs.getInt("member_id"),
                        rs.getString("member_name"),
                        rs.getString("contact_number"),
                        rs.getString("email"),
                        rs.getString("card_number"),
                        rs.getString("expiration_date")
                    );
                    member.setActive(rs.getBoolean("is_active"));
                    members.add(member);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return members;
    }
    
    
boolean isMemberActive(int memberID) {
    String query = "SELECT is_active FROM members WHERE member_id = ?";
    boolean isActive = false; 
    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        pstmt.setInt(1, memberID);  
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                isActive = rs.getBoolean("is_active");  
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return isActive;  
}

 



    
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();  
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 public String getMemberName(int memberID) {
    String query = "SELECT member_name FROM members WHERE member_id = ?";  
    try (PreparedStatement pstmt = connection.prepareStatement(query)) {  
        pstmt.setInt(1, memberID); 
        try (ResultSet rs = pstmt.executeQuery()) {  
            if (rs.next()) {  
                return rs.getString("member_name");  
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); 
    }
    return "Unknown Member";  
}
}
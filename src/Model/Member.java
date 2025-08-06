package Model;

import java.sql.Date;

public class Member extends User {
    private int memberID;
    private String name;
    private String contactInfo;
    private String email;
    private String cardNumber;
    private Date expirationDate;
    private boolean isActive;

    public Member(int memberID, String username, String password, String name, String contactInfo, String email) {
        super(username, password);
        this.memberID = memberID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.email = email;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.isActive = isActive;
    }

    public Member(int memberID, String name, String contactInfo, String email, String cardNumber, Date expirationDate) {
        super("defaultUsername", "defaultPassword");
        this.memberID = memberID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.email = email;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.isActive = true;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void displayDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Email: " + email);
        System.out.println("Membership Card: " + cardNumber);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Active: " + (isActive ? "Yes" : "No"));
    }

    public String getMemberName() {
        return name;
    }

    public String getContactNumber() {
        return contactInfo;
    }
}

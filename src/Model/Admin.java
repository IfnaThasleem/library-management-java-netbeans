
package Model;

public class Admin extends User {
        public Admin(String username, String password) {
        super(username, password);
    }

    
    public void manageBooks() {
        System.out.println("Admin managing books...");
    }

    public void manageMembers() {
        System.out.println("Admin managing members...");
    }

}

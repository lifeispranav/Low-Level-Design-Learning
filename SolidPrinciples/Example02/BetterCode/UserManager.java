package SolidPrinciples.Example02.BetterCode;

public class UserManager {

    public void addUser(User user) {
        if(user.getage() < 18) {
            throw new IllegalArgumentException("User is too young to be added");
        }
        System.out.println("User added successfully");
    }

    public void deleteUser(User user) {
        System.out.println("User deleted successfully");
    }

    public void updateUser(User user) {
        if(user.getage() < 18) {
            throw new IllegalArgumentException("User is too young to be updated");
        }
        System.out.println("User updated successfully");
    }

    public void getUser(User user) {
        System.out.println("User fetched successfully");
    }
    
}

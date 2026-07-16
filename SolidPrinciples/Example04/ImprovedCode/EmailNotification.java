package SolidPrinciples.Example04.ImprovedCode;

public class EmailNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        // Send email notification
        System.out.println("Email: " + message);
    }

}

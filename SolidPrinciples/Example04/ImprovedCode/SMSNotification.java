package SolidPrinciples.Example04.ImprovedCode;

public class SMSNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        // Send SMS notification
        System.out.println("SMS: " + message);
    }
    
}

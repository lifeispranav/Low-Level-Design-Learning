package SolidPrinciples.Example04.ImprovedCode;

public class PushNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        // Send push notification
        System.out.println("Push: " + message);
    }
    
}

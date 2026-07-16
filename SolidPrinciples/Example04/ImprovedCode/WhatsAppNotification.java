package SolidPrinciples.Example04.ImprovedCode;

public class WhatsAppNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        // Send WhatsApp notification
        System.out.println("WhatsApp: " + message);
    }
    
}

package SolidPrinciples.Example04.ProblematicCode;

public enum NotificationType {

    SMS,
    EMAIL,
    PUSH,
    WHATSAPP;

    public void sendSMSNotification(String message) {
        // Send SMS notification
        System.out.println("SMS: " + message);
    }

    public void sendEmailNotification() {
        // Send email notification
        System.out.println("Email: ");
    }

    public void sendPushNotification() {
        // Send push notification
        System.out.println("Push: ");
    }

    public void sendWhatsAppNotification() {
        // Send WhatsApp notification
        System.out.println("WhatsApp: ");
    }
    
}

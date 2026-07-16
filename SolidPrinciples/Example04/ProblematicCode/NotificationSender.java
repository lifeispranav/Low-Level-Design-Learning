package SolidPrinciples.Example04.ProblematicCode;

public class NotificationSender {
    
    public void sendNotification(NotificationType notificationType, String message) {
        switch (notificationType) {
            case SMS:
                notificationType.sendSMSNotification(message);
                break;
            case EMAIL:
                notificationType.sendEmailNotification();
                break;
            case PUSH:
                notificationType.sendPushNotification();
                break;
            case WHATSAPP:
                notificationType.sendWhatsAppNotification();
                break;
        }
    }

}

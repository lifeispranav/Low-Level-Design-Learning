package SolidPrinciples.Example04.ImprovedCode;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Notification smsNotification = new SMSNotification();
        Notification emailNotification = new EmailNotification();
        Notification pushNotification = new PushNotification();
        Notification whatsAppNotification = new WhatsAppNotification();
        
        NotificationSender notificationSender = new NotificationSender();
        notificationSender.sendNotification(List.of(smsNotification, emailNotification, pushNotification, whatsAppNotification), "Hello World");
        
    }
}

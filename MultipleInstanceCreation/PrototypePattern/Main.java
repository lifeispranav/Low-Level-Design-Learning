package MultipleInstanceCreation.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        
        Email email = new Email("receiver@gmail.com", "sender@gmail.com", "Subject", "Body");
        Email copyMail = email.copy();

        PremiumEmail premiumEmail = new PremiumEmail("receiver@gmail.com", "sender@gmail.com", "Subject", "Body", "High");
        PremiumEmail copyPremiumEmail = premiumEmail.copy();
        
        System.out.println("Original Email:");
        email.display();
        System.out.println("-------Copy Mail-------");
        copyMail.display();
        System.out.println();
        
        System.out.println("Original Premium Email:");
        premiumEmail.display();
        System.out.println("-------Copy Premium Email-------");
        copyPremiumEmail.display();
    }
}

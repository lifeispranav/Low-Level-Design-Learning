package MultipleInstanceCreation.CopyConstructor;

public class Main {
    public static void main(String[] args) {
        
        Email email = new PremiumEmail("receiver@gmail.com", "sender@gmail.com", "Subject", "Body", "High");

        // Problem comes when we have a child class of the Email Class..
        // There its a confusion, whose copy constructor to call!

        if (email instanceof PremiumEmail) {
            PremiumEmail premiumEmail = (PremiumEmail) email;
            PremiumEmail copyPremiumEmail = new PremiumEmail(premiumEmail);
            System.out.println("Original Premium Email:");
            premiumEmail.display();
            System.out.println("-------Copy Premium Email-------");
            copyPremiumEmail.display();
            System.out.println("-------End Copy Premium Email-------");
        }

        else {
            Email copyEmail = new Email(email);
            System.out.println("Original Email:");
            email.display();
            System.out.println("-------Copy Email-------");
            copyEmail.display();
            System.out.println("-------End Copy Email-------");
        }

    }
}

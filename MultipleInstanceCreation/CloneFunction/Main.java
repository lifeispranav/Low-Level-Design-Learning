package MultipleInstanceCreation.CloneFunction;

public class Main {
    public static void main(String[] args) {
        
        Email email = new Email("receiver@gmail.com", "sender@gmail.com", "Subject", "Body");
        Email copyMail = email.emailClone();

        System.out.println("Original Email:");
        email.display();
        System.out.println("-------Copy Mail-------");
        copyMail.display();
        System.out.println("-------End Copy Mail-------");

    }
}

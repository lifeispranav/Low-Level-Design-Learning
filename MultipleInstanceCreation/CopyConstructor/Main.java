package MultipleInstanceCreation.CopyConstructor;

public class Main {
    public static void main(String[] args) {
        
        Email email = new Email("receiver@gmail.com", "sender@gmail.com", "Subject", "Body");
        Email copyMail = new Email(email);

        System.out.println("Original Email:");
        email.display();
        System.out.println("-------Copy Mail-------");
        copyMail.display();
        System.out.println("-------End Copy Mail-------");

        // Problem comes when we have a child class of the Email Class..
        // There its a confusion, whose copy constructor to call!

    }
}

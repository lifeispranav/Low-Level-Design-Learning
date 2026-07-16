package MultipleInstanceCreation.BasicImplementation;

public class Main {
    public static void main(String[] args) {
        
        Email email = new Email("receiver@gmail.com", "sender@gmail.com", "Subject", "Body");
        Email copyMail = new Email();

        copyMail.setReceiver(email.getReceiver());
        copyMail.setSender(email.getSender());
        copyMail.setSubject(email.getSubject());
        copyMail.setBody(email.getBody());

        System.out.println("---------Original Mail--------");
        System.out.println(email.getReceiver());
        System.out.println(email.getSender());
        System.out.println(email.getSubject());
        System.out.println(email.getBody());

        System.out.println("-----------Copy Mail----------");
        System.out.println(copyMail.getReceiver());
        System.out.println(copyMail.getSender());
        System.out.println(copyMail.getSubject());
        System.out.println(copyMail.getBody());

    }
}

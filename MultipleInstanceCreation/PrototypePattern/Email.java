package MultipleInstanceCreation.PrototypePattern;

public class Email implements Copyable<Email> {
    
    private String receiver;
    private String sender;
    private String subject;
    private String body;

    // Default Constructor
    public Email() {};

    public Email(String receiver, String sender, String subject, String body) {
        this.receiver = receiver;
        this.sender = sender;
        this.subject = subject;
        this.body = body;
    }

    // Copy Constructor
    Email (Email email) {
        this.receiver = email.getReceiver();
        this.sender = email.getSender();
        this.subject = email.getSubject();
        this.body = email.getBody();
    }

    // Copy Method we have Crated! -> Copyable/Cloneable Function
    @Override
    public Email copy() {
        return new Email(this);
    }


    // Legacy method
    public Email emailClone() {
        Email clone = new Email();
        clone.setReceiver(this.receiver);
        clone.setSender(this.sender);
        clone.setSubject(this.subject);
        clone.setBody(this.body);
        return clone;
    }

    public void display () {
        System.out.println("Sender: " + this.sender);
        System.out.println("Receiver: " + this.receiver);
        System.out.println("Subject: " + this.subject);
        System.out.println("Body: " + this.body);
    }

    // Getters and Setters
    String getReceiver() {
        return receiver;
    }

    String getSender() {
        return sender;
    }

    String getSubject() {
        return subject;
    }

    String getBody() {
        return body;
    }

    void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    void setSender(String sender) {
        this.sender = sender;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void setBody(String body) {
        this.body = body;
    }

}

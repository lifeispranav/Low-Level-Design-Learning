package MultipleInstanceCreation.CopyConstructor;

public class Email {
    
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

    public Email copy(Email email) {
        Email copy = new Email();
        copy.setReceiver(email.getReceiver());
        copy.setSender(email.getSender());
        copy.setSubject(email.getSubject());
        copy.setBody(email.getBody());
        return copy;
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

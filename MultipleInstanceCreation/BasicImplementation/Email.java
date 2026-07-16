package MultipleInstanceCreation.BasicImplementation;

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

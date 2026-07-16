package MultipleInstanceCreation.CloneFunction;

public class PremiumEmail extends Email {

    private String priority;
    
    public PremiumEmail() {
        super();
    }

    public PremiumEmail(String receiver, String sender, String subject, String body, String priority) {
        super(receiver, sender, subject, body);
        this.priority = priority;
    }

    public PremiumEmail emailClone() {
        PremiumEmail clone = new PremiumEmail();
        clone.setReceiver(this.getReceiver());
        clone.setSender(this.getSender());
        clone.setSubject(this.getSubject());
        clone.setBody(this.getBody());
        clone.setPriority(this.getPriority());
        return clone;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void display() {
        super.display();
        System.out.println("Priority: " + this.priority);
    }
    
}

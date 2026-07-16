package MultipleInstanceCreation.CopyConstructor;

public class PremiumEmail extends Email {

    private String priority;
    
    public PremiumEmail() {
        super();
    }

    public PremiumEmail(String receiver, String sender, String subject, String body, String priority) {
        super(receiver, sender, subject, body);
        this.priority = priority;
    }

    public PremiumEmail(PremiumEmail premiumEmail) {
        super(premiumEmail);
        this.priority = premiumEmail.getPriority();
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

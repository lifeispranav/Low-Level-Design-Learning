package SolidPrinciples.Example06.ProblematicCode;

public class Visa extends CreditCard implements RefundCompatibleCC {
    
    public RefundAlgorithm refundAlgorithm;

    public Visa(RefundAlgorithm refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }

    @Override 
    public void swipeAndPay() {
        System.out.println("Visa Credit Card: Swipe and Pay");
    }
    
    @Override
    public void onlinePayment() {
        System.out.println("Visa Credit Card: Online Payment");
    }
    
    @Override
    public void tapAndPay() {
        System.out.println("Visa Credit Card: Tap and Pay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.algo1();
    }
    
}

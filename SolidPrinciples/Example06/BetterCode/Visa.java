package SolidPrinciples.Example06.BetterCode;

public class Visa extends CreditCard implements RefundCompatibleCC {
    
    public SameInstrumentRefund refundAlgorithm;

    public Visa(SameInstrumentRefund refundAlgorithm) {
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
        refundAlgorithm.doRefund();
    }
    
}

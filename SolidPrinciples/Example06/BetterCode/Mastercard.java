package SolidPrinciples.Example06.BetterCode;

public class Mastercard extends CreditCard implements RefundCompatibleCC {
    
    public SameInstrumentRefund refundAlgorithm;

    @Override
    public void swipeAndPay() {
        System.out.println("Mastercard Credit Card: Swipe and Pay");
    }
    
    @Override
    public void onlinePayment() {
        System.out.println("Mastercard Credit Card: Online Payment");
    }
    
    @Override
    public void tapAndPay() {
        System.out.println("Mastercard Credit Card: Tap and Pay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }

}

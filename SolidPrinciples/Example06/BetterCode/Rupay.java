package SolidPrinciples.Example06.BetterCode;

public class Rupay extends CreditCard implements RefundCompatibleCC {
    
    public SameWalletRefund refundAlgorithm;

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay Credit Card: Swipe and Pay");
    }
    
    @Override
    public void onlinePayment() {
        System.out.println("Rupay Credit Card: Online Payment");
    }
    
    @Override
    public void tapAndPay() {
        System.out.println("Rupay Credit Card: Tap and Pay");
    }
    
    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
    
}

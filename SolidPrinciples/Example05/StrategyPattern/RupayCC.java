package SolidPrinciples.Example05.StrategyPattern;

public class RupayCC extends CreditCard implements UPICompatibleCC, RefundCompatibleCC {
    
    private RefundStrategy refundStrategy;

    public RupayCC() {
        this.refundStrategy = new SameInstrumentRefundStrategy();
    }
    
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
    public void upiPayment() {
        System.out.println("Rupay Credit Card: UPI Payment");
    }

    @Override
    public void doRefund() {
        this.refundStrategy.doRefund();
    }
    
}

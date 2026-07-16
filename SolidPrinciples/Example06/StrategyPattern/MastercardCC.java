package SolidPrinciples.Example06.StrategyPattern;

public class MastercardCC extends CreditCard implements RefundCompatibleCC {
    
    private RefundStrategy refundStrategy;

    public MastercardCC() {
        this.refundStrategy = new BankAccountRefundStrategy();
    }

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
    public void doRefund() {
        this.refundStrategy.doRefund();
    }

}
